package com.company;
import java.util.Random;

public class EmployeeFactory {
    int size;

    //Employee[] employees;

    public Employee[] initEmp() {

    Employee emp1 = new Employee(0, "Stas", 25, 2000, "male", 10);
    Employee emp2 = new Employee(1, "Serg", 23, 900, "male", 6);
    Employee emp3 = new Employee(2, "Kite", 50, 350, "female", 1);
    Employee emp4 = new Employee(3, "Anna", 19, 1000, "female", 8);
    Employee emp5 = new Employee(4, "Valentina", 40, 1000, "female", 7);
    Employee emp6 = new Employee(5, "Viktoria", 36, 900, "female", 2);


    Employee[] employees = {emp1, emp2, emp3, emp4, emp5, emp6};

    return employees;
}

    public static int minAge = 18;
    public static int maxAge = 65;

    public static int bonus;

    public static int minFixedBugs = 0;
    public static int maxFixedBugs = 20;

    public static int minSalary = 700;
    public static int maxSalary = 3500;

    public static final String male = "Male";
    public static final String female = "Female";

    public static String[] names= {"Anna",
                                    "Valentina",
                                    "Alex",
                                    "Evgen",
                                    "Vasia",
                                    "Anton",
                                    "Olga",
                                    "Richard",
                                    "Oleg",
                                    "Kostia",
                                    "Victoria"};


    public Employee[] generateRandEmployees(int size){

        if(size<0){
            return null;
        }

        Employee[] employees = new Employee[size];
        Random random = new Random();

        for (int i = 0; i < employees.length; i++) {

            Employee employee = new Employee();
            employee.setId(i);
            employee.setName(getRandName());
            employee.setAge(getRandNum(minAge,maxAge));
            boolean gender = random.nextBoolean();

            if (gender) {
                employee.setGender(male);
            } else {
                employee.setGender(female);
            }
            employee.setSalary(getRandNum(minSalary,maxSalary));
            employee.setFixedBugs(getRandNum(minFixedBugs,maxFixedBugs));
            employee.setDefaultBugRate();
            employee.setBonus(employee.fixedBugs,employee.defaultBugRate);
            employees[i] = employee;
        }

        return employees;
    }


    public static  int getRandNum(int min,int max){
        return min + (int)(Math.random() * ((max - min) + 1));
    }

    public String getRandName() {
        Random random = new Random();
        return names[random.nextInt(names.length)];
    }


}
