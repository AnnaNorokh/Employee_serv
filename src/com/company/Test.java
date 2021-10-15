package com.company;
/*Разработать приложение по учету сотрудников предприятия.
Каждый сотрудник имеет следующие свойства
id, name, age, salary, gender, fixedBugs, defaultBugRate

salary - ставка сотрудника которую он получает каждый месяц
на основании полей fixedBugs и defaultBugRate можно рассчитать бонус который сотрудник получит к зарплате в этом месяце

Разработать класс EmployeeService который будет хранить всех сотрудников предприятия в массиве.
Класс должен содержать методы для работы с сотрудниками (которые представлены массивом внутри класса):


void printEmployees() -> вывод на экран информации о сотрудниках
double calculateSalaryAndBonus() -> возвращает количество денег
 необходимое для выплаты зарплат для всех сотрудников в этом месяце (пробегаем по всем сотрудникам, суммируем зарплату каждого с бонусом каждого)

Employee getById(long) -> возвращает сотрудника по заданному id
Employee[] getByName(String) -> возвращает сотрудника по заданному имени
Employee[] sortByName()
Employee[] sortByNameAndSalary() -> возвращают отсортированный массив с сотрудниками по критерию
Employee edit(Employee) -> находит сотрудника по id, и подменяет информацию о нем на новую. Старую версию сотрудника метод возвращает.

Employee remove(long id) -> находит сотрудника по id, и удаляет его из массива. Возвращает ссылку на удаленного сотрудника.

Написать класс EmployeeFactory с методом:
generateEmployees(size) -> генерирует случайным образом заданое количество сотрудников

Использовать класс Test для создания объекта EmploeeService и тестирования описаных выше методов.
*/
public class Test {

    public static void main(String[] args) {

        EmployeeFactory employeesFactory = new EmployeeFactory();
        Employee[] employees = employeesFactory.generateEmployees();

        EmployeeService service = new EmployeeService(employees);

        Employee[] printEmp = service.printEmployees(employees);
        Employee getName = service.getByName("Stas");

        printEmployee(getName);


    }

    public static void printEmployee(Employee employee) {
        System.out.println("Employee{" +
                "id=" +employee.id +
                ", name='" + employee.name + '\'' +
                ", age=" + employee.age +
                ", salary=" + employee.salary +
                ", gender='" + employee.gender + '\'' +
                ", fixedBugs=" + employee.fixedBugs +
                '}');
    }
}
