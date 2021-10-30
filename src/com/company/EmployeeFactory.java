package com.company;
import java.util.Random;

public class EmployeeFactory {
    int size;

    Employee[] employees;

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
