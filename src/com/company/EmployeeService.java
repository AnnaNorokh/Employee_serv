package com.company;

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
        return null;
    }

    /*double calculateSalaryAndBonus(int salary){
    }
    Employee getById(long id){

    }

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
