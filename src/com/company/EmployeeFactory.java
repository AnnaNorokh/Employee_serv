package com.company;

import All_employees.Designer;
import All_employees.Developer;
import All_employees.Employee;
import All_employees.Manager;

import java.util.Random;

public class EmployeeFactory {
    int size;

    //Employee[] employees;

    public Employee[] initEmp() {

    Employee emp1 = new Employee(0, "Stas", 25, 2000, "male");
    Employee emp2 = new Employee(1, "Serg", 23, 900, "male");
    Employee emp3 = new Employee(2, "Kite", 50, 350, "female");
    Employee emp4 = new Employee(3, "Anna", 19, 1000, "female");
    Employee emp5 = new Employee(4, "Valentina", 40, 1000, "female");
    Employee emp6 = new Employee(5, "Viktoria", 36, 900, "female");

    Employee[] employees = {emp1, emp2, emp3, emp4, emp5, emp6};

    return employees;
    }

    public static int minAge = 18;
    public static int maxAge = 65;

    public static int minWorkdays = 30;
    public static int maxWorkdays = 14;

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

    Random random = new Random();

    public Employee[] generateRandEmployees(int size){

        if(size<0){
            return null;
        }
        Employee[] employees = new Employee[size];

        for (int i = 0; i < employees.length; i++) {

            Employee employee = new Employee();
            int role = getRandNum(0,2);
            if(role == 0){
                employee = generateRandManager(i);
            } else if(role == 1){
                employee = generateRandDeveloper(i);
            } else if (role == 2){
                employee = generateRandManager(i);
            }
            employees[i]=employee;
        }

        return employees;
    }

    public Designer generateRandDesigner(int id){
        Designer designer = new Designer();
        designer.setId(id);
        designer.setName(getRandName());
        designer.setAge(getRandNum(minAge,maxAge));
        designer.setGender(getRandGend());
        designer.setSalary(getRandNum(minSalary,maxSalary));
        designer.setWorkedDays(getRandNum(minWorkdays,maxWorkdays));

        return designer;
    }

    public Manager generateRandManager(int id){
        Manager manager = new Manager();
        manager.setId(id);
        manager.setName(getRandName());
        manager.setAge(getRandNum(minAge,maxAge));
        manager.setSalary(getRandNum(minSalary,maxSalary));
        manager.setGender(getRandGend());
        manager.setSalary(getRandNum(minSalary,maxSalary));

        return manager;
    }

    public Developer generateRandDeveloper(int id){
        Developer developer = new Developer();
        developer.setId(id);
        developer.setName(getRandName());
        developer.setAge(getRandNum(minAge,maxAge));
        developer.setGender(getRandGend());
        developer.setRate(getRandNum(minSalary,maxSalary));
        developer.setFixedBugs(getRandNum(minFixedBugs,maxFixedBugs));
        developer.setSalary(developer.fixedBugs,developer.rate);

        return developer;


    }

    public static  int getRandNum(int min,int max){
        return min + (int)(Math.random() * ((max - min) + 1));
    }

    public String getRandName() {
        Random random = new Random();
        return names[random.nextInt(names.length)];
    }

    public String getRandGend(){
        boolean gender = random.nextBoolean();

        if (gender) { return "male";  }
        else { return "female";  }

    }


}
