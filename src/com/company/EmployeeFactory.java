package com.company;

public class EmployeeFactory {
    int size;

    public Employee[] generateEmployees(){
        Employee empOne = new Employee(451632441,"Stas",25,2_000,"male",10);
        Employee empTwo = new Employee(451635241,"Serg",23,1_500,"male",6);

        Employee[] employees = {empOne,empTwo};

        return employees;
    }
}
