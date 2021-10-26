package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeeService {

    Employee[] employees;

    public EmployeeService(Employee[] employees) {
        this.employees = employees;
    }

   //public EmployeeService() {   }

    Employee[] printEmployees(Employee[] employees) {

        for(Employee employee : employees ){
                System.out.println("Employee{" +
                        "id=" + employee.id +
                        ", name='" + employee.name + '\'' +
                        ", age=" + employee.age +
                        ", salary=" + employee.salary +
                        ", gender='" + employee.gender + '\'' +
                        ", fixedBugs=" + employee.fixedBugs +
                        ", bonus=" + employee.bonus +
                        '}');

        }
        return employees;
    }

    Employee getByName(String name) {
        for (int i = 0; i < employees.length; i++) {
            Employee currentEmp = employees[i];
            if(currentEmp.name == name){
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
           allMoney += employee.bonus;
           allMoney += employee.salary;
        }
        return allMoney;
    }
    /*void deleteById(long id) {
        for (long i =  id; i < employees.length-1; i++) {
            //Employee currentEmp = employees[(int) i];
            employees[(int) i]=employees[(int) i++];
            System.out.println("1");
        }



      //  System.out.println("Сотрудника с таким id не существует");
        //return null;
    }
   Employee sortEmployees(Employee[] employees) {
        return Arrays.sort(employees, new Comparator<Employee>() {
            public int compare(Employee emp1, Employee emp2) {
                return emp1.toString().compareTo(emp2.toString());
            }
        }
        return null;
    }
    */


    /*
    Employee[] sortByName(Employee employee){

    }
    Employee[] sortByNameAndSalary(Employee employee) {

    }
    Employee edit(Employee employee) {
    }
    Employee remove(long id){

    }
    */

}
