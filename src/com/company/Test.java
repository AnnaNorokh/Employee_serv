/*
Типы сотрудников + характеристики для хранения:
Developer (id, name, age, salary, gender, fixedBugs)
Manager (id, name, age, salary, gender)
Designer (id, name, age, salary, gender, rate, workedDays)

ставка -> salary
Расчет итоговой зарплаты для
Developer происходит по формуле: (ставка + fixedBugs * коэффициент) * (randomBoolean ? 2 : 0)

Итоговой зарплатой Manager-а является его ставка:

Расчет итоговой зарплаты для Designer происходит по формуле: ставка + rate * workedDays

Разработать класс EmployeeService который будет хранить всех сотрудников предприятия в массиве.
Класс должен содержать методы для работы с сотрудниками (которые представлены массивом внутри класса):

void printEmployees() -> вывод на экран информации о сотрудниках
double calculateSalaryAndBonus() -> возвращает количество денег необходимое для выплаты зарплат для всех сотрудников в этом месяце
Employee getById(long) -> возвращает сотрудника по заданному id
Employee[] getByName(String) -> возвращает сотрудника по заданному имени
Employee[] sortByName()
Employee[] sortByNameAndSalary() -> возвращают отсортированный массив с сотрудниками по критерию
Employee edit(Employee) -> находит сотрудника по id, и подменяет информацию о нем на новую. Старую версию сотрудника метод возвращает.
Employee remove(long id) -> находит сотрудника по id, и удаляет его из массива. Возвращает ссылку на удаленного сотрудника. Массив сокращается на 1.
void add(Employee) -> Добавляет нового сотрудника. Массив увеличивается на 1.

Написать класс EmployeeFactory с методом:
generateEmployees(size) -> генерирует случайным образом заданое количество сотрудников
Использовать класс Test для создания объекта EmploeeService и тестирования описаных выше методов.
*/
package com.company;
import All_employees.Employee;
import All_employees.Designer;
import All_employees.Developer;
import All_employees.Manager;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws Exception{

        EmployeeTest test = new EmployeeTest();
        EmployeeFactory employeesFactory = new EmployeeFactory();
        Employee[] employees = employeesFactory.generateRandEmployees(16);//генерация

        //EmployeeService service = new EmployeeService(employees);

/*
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
*/

        Manager manager = new Manager();
        manager = employeesFactory.generateRandManager(6);
        printEmployee(manager);

        System.out.println("lol");

        Employee[] printEmp = printEmployee(employees);
        //printMenu(employees);

        System.out.println();
    }

    public static Employee[] printEmployee(Employee[] employees) {

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

    public static void printEmployee(Employee employee ) {
        System.out.println("Employee{" +
                "id=" +employee.id +
                ", name='" + employee.name + '\'' +
                ", age=" + employee.age +
                ", salary=" + employee.salary +
                ", gender='" + employee.gender + '\'' +
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
