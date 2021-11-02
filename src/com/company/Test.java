package com.company;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws Exception{

        EmployeeTest test = new EmployeeTest();
        EmployeeFactory employeesFactory = new EmployeeFactory();
        Employee[] employees = employeesFactory.generateRandEmployees(11);//генерация

        EmployeeService service = new EmployeeService(employees);


        System.out.println("=========================Tests===============================");
        System.out.println("=============================================================");
        test.testEmployFactory();
        test.getByNameTest();
        test.getByIdTest();
        test.calculateSalaryAndBonusTest();
        test.editTest();
        test.removeTest();
        test.sortByNameTest();
        test.sortByNameAndSalaryTest();
        System.out.println("=============================================================");
        System.out.println("==========================END================================");


        Employee[] printEmp = service.printEmployees(employees);
        printMenu(employees);

        System.out.println();
    }

    public static void printEmployee(Employee employee) {
        System.out.println("Employee{" +
                "id=" +employee.id +
                ", name='" + employee.name + '\'' +
                ", age=" + employee.age +
                ", salary=" + employee.salary +
                ", gender='" + employee.gender + '\'' +
                ", fixedBugs=" + employee.fixedBugs +
                ", bonus=" + employee.bonus +
                '}');
    }
    public static void printMenu(Employee[] employees) {

        EmployeeService service = new EmployeeService(employees);
        Scanner scaner = new Scanner(System.in);
        Scanner scaner2 = new Scanner(System.in);

        boolean flag = true;

            while (flag) {
                System.out.println("\nМеню\n" +
                        "1. Выбор по ID\n" +
                        "2. Выбор по имени\n" +
                        "3. Сортировка по имени\n" +
                        "4. Сортировка по зарплате и имени\n" +
                        "5. Поменять информацию о сотруднике\n" +
                        "6. Удалить сотрудника\n"+
                        "7. Узнать сумму денег для выплат зарплат в этом месяце"+
                        "8. Выход");

                System.out.println("Введите число:");
                int otv= scaner.nextInt();


            switch (otv) {
                case 1: {
                    System.out.println("Введите ID:");
                    int otvID = scaner.nextInt();
                    Employee getId = service.getById(otvID);
                    printEmployee(getId);
                    break;
                }
                case 2: {
                    System.out.println("Введите имя:");
                    String otvName = scaner2.nextLine();
                    Employee getName1 = service.getByName(otvName);
                    printEmployee(getName1);
                    break;
                }
                case 3 :{
                    System.out.println("Сортировка по имени");
                    Employee[] SortName = service.sortByName();
                    Employee[] print2 = service.printEmployees(SortName);
                    break;
            }

                case 4 : {
                    System.out.println("Сортировка по зарплате и имени");
                    Employee[] sortNameAndSalary = service.sortByNameAndSalary();
                    Employee[] print2 = service.printEmployees(sortNameAndSalary);
                    break;
                }

                case 5: {
                    System.out.println("Введите ID:");
                    int otvID = scaner.nextInt();
                    Employee[] getEdit = service.edit(otvID);
                    Employee[] print2 = service.printEmployees(getEdit);
                    break;
                }

                case 6: {
                    System.out.println("Введите ID:");
                    int otvID = scaner.nextInt();
                    Employee[] getId = service.remove(otvID);
                    Employee[] print2 = service.printEmployees(getId);
                    break;
                }

                case 7: {
                    int allMoney = service.calculateSalaryAndBonus();
                    System.out.println("Для выплаты зараплат всм сотрудникам в этом месяце требуется - " + allMoney + "$");
                    break;
                }

                case 8: {
                    System.out.println("Пока :) ");
                    flag=false;
                    break;
                }

                default: {
                    break;
                }
            }
        }

    }
}
