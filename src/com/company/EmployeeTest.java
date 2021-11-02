package com.company;

public class EmployeeTest {

    EmployeeFactory employeeFactory = new EmployeeFactory();
    Employee[] employees = employeeFactory.initEmp();
    EmployeeService employeeServ = new EmployeeService(employees);

    public void testEmployFactory() {
        System.out.println("testEmployFactory");
        Employee[] employees = employeeFactory.generateRandEmployees(10);
        employeeServ.printEmployees(employees);
    }

    public void getByNameTest(){
        System.out.print("\ngetByNameTest: ");
        Employee result;
        String expected ="Anna";
        result = employeeServ.getByName("Anna");

        if(expected.equals(result.name)){
            System.out.print("TEST PASSED");
        } else {
            System.out.print("TEST FAILED");
        }
    }

    public void getByIdTest(){
        System.out.print("\ngetByIdTest: ");
        Employee result;
        long expected = 5;
        result = employeeServ.getById(5);

        if(expected == result.id){
            System.out.print("TEST PASSED");
        } else {
            System.out.print("TEST FAILED");
        }
    }

    public void calculateSalaryAndBonusTest(){
        employeeServ.calculateSalaryAndBonus();
        System.out.print("\nalculateSalaryAndBonusTest: ");
        int result;
        int expected = 6150;
        result = employeeServ.calculateSalaryAndBonus();

        if(expected == result){
            System.out.print("TEST PASSED");
        } else {
            System.out.print("TEST FAILED");
        }

    }

    public void editTest(){

        System.out.print("\neditTest: ");
        Employee result, expected;
        expected = employees[2];
        String ex = expected.name;
        Employee[] resultE =employeeServ.edit(2);
        result = resultE[2];
        String res = result.name;

        if(!res.equals(ex)){
            System.out.print("TEST PASSED");
        } else {
            System.out.print("TEST FAILED");
        }
    }

    public void removeTest(){
        System.out.print("\nremoveTest: ");
        Employee result2;
        long expected = 2;
        Employee[] result =employeeServ.remove(2);
        result2= result[2];

        if(expected != result2.id){
            System.out.print("TEST PASSED");
        } else {
            System.out.print("TEST FAILED");
        }
    }

    public void sortByNameTest(){
        System.out.print("\nsortByNameTest: ");
        employeeServ.printEmployees(employees);
        System.out.println();
        Employee[] rsort = employeeServ.sortByName();
        employeeServ.printEmployees(rsort);
        System.out.println();
    }
    public void sortByNameAndSalaryTest(){
        System.out.print("\nsortByNameAndSalaryTest: ");
        employeeServ.printEmployees(employees);
        System.out.println();
        Employee[] rsort = employeeServ.sortByNameAndSalary();
        employeeServ.printEmployees(rsort);
        System.out.println();
    }

}


