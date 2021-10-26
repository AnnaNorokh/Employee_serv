package com.company;
/*

Разработать класс EmployeeService который будет хранить всех сотрудников предприятия в массиве.
Класс должен содержать методы для работы с сотрудниками (которые представлены массивом внутри класса):


Employee[] sortByName()
Employee[] sortByNameAndSalary() -> возвращают отсортированный массив с сотрудниками по критерию
Employee edit(Employee) -> находит сотрудника по id, и подменяет информацию о нем на новую. Старую версию сотрудника метод возвращает.

Employee remove(long id) -> находит сотрудника по id, и удаляет его из массива. Возвращает ссылку на удаленного сотрудника.


Использовать класс Test для создания объекта EmploeeService и тестирования описаных выше методов.
*/
public class Test {

    public static void main(String[] args) {

        EmployeeFactory employeesFactory = new EmployeeFactory();
        Employee[] employees2 = employeesFactory.generateEmployees();//мануал

        Employee[] employees = employeesFactory.generateRandEmployees(11);//генерация

        EmployeeService service = new EmployeeService(employees);

        Employee[] printEmp = service.printEmployees(employees);

        //

        //System.out.println();
        //Employee[] printEmp1 = service.printEmployees(employees);



        System.out.println();
        Employee getId = service.getById(6);

        Employee getName = service.getByName("Anna");
        printEmployee(getName);
        printEmployee(getId);

        int allMoney = service.calculateSalaryAndBonus();
        System.out.println("Для выплаты зараплат всм сотрудникам в этом месяце требуется - "+ allMoney+"$");
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
}
