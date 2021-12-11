package com.company;

import All_employees.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class EmployeeService {

    Employee[] employees ;

    public EmployeeService(Employee[] employees) {
        this.employees = employees;
    }

   public void printEmployees(Employee employee) {
       System.out.println("Employee{" +
               "id=" +employee.id +
               ", name='" + employee.name + '\'' +
               ", age=" + employee.age +
               ", salary=" + employee.salary +
               ", gender='" + employee.gender + '\'' +
               '}');
   }

    public Employee[] printEmployees(Employee[] employees) {

        for(Employee employee : employees ){
                System.out.println("Employee{" +
                        "id=" + employee.id +
                        ", name='" + employee.name + '\'' +
                        ", age=" + employee.age +
                        ", salary=" + employee.salary +
                        ", gender='" + employee.gender + '\'' +
                        '}');
        }
        return employees;
    }

    Employee getByName(String name)  {

        for (int i = 0; i < employees.length; i++) {
            Employee currentEmp = employees[i];
            if(currentEmp.name.equals(name)){
                return currentEmp;
            }
        }
        System.out.println("Сотрудника с таким именем не существует");
        return null;
    }

    Employee getById(long id) {
        for (int i = 0; i < employees.length; i++) {
            Employee currentEmp = employees[i];
            if(currentEmp.id == id){
                return currentEmp;
            }
        }

        System.out.println("Сотрудника с таким id не существует");

        return null;
    }

    int calculateSalaryAndBonus(){
        int allMoney = 0;
        for (int i = 0; i < employees.length; i++) {
           Employee employee = employees[i];
           //allMoney += employee.bonus;
           allMoney += employee.salary;
        }
        return allMoney;
    }


    Employee[] remove(long id) {
        for (long i = id; i < employees.length - 1; i++) {
            Employee currentEmp = employees[(int) i];


            if (currentEmp.id == id) {
                System.out.println("удален: "+currentEmp+"\n");
                Employee[] arrNew = new Employee[employees.length - 1];
                int remainingElements = employees.length - ( (int)id + 1 );
                System.arraycopy(employees, 0, arrNew, 0, (int)id);
                System.arraycopy(employees, (int)id + 1, arrNew, (int)id, remainingElements);
                return arrNew;
            }

        }
        System.out.println("Сотрудника с таким id не существует");
        return null;
    }

    Employee[] edit(long id) {
        Scanner scaner = new Scanner(System.in);
        Scanner scaner1 = new Scanner(System.in);
        for (long i = id; i < employees.length - 1; i++) {
            Employee currentEmp = employees[(int) i];
            if (currentEmp.id == id) {

                System.out.println("Изменяемый сотрудник: ");
                printEmployees(currentEmp);

                System.out.println("Введите новое Имя: ");
                String newName = scaner1.nextLine();
                currentEmp.setName(newName);

                System.out.println("Введите новый возраст: ");
                int newAge = scaner.nextInt();
                currentEmp.setAge(newAge);

                System.out.println("Введите новую зарплату: ");
                int newSalary= scaner.nextInt();
                currentEmp.setSalary(newSalary);

                System.out.println("Введите новый пол: ");
                String newGend= scaner1.nextLine();
                currentEmp.setGender(newGend);

                System.out.println("Введите новое количество багов: ");
                int newFixB= scaner.nextInt();
                //currentEmp.setFixedBugs(newFixB);

                //int def = currentEmp.getDefaultBugRate();
                //currentEmp.setBonus(newFixB,def);

                return employees;
            }

        }
        System.out.println("Сотрудника с таким id не существует");
        return null;
    }

    Employee[] sortByName() {

        Arrays.sort(employees, Comparator.comparing(Employee::getName));
        return employees;

        }

    Employee[] sortByNameAndSalary() {

        Arrays.sort(employees, Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary));
        return employees;

    }






}
