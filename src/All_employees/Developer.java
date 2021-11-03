package All_employees;

import java.util.Random;

public class Developer {
    public long id;
    public String name;
    public int age;

    public int salary;
    public int rate;
    public String gender;
    public int fixedBugs;
    public int defaultBugRate;
    public int bonus;

    Random random = new Random();

    public Developer(long id,String  name,int age,int salary,String gender,int fixedBugs) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.rate = salary;
        this.gender = gender;
        this.fixedBugs = fixedBugs;
    }

    public Developer(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getFixedBugs() {
        return fixedBugs;
    }

    public void setFixedBugs(int fixedBugs) {
        this.fixedBugs = fixedBugs;
    }

    public int getDefaultBugRate() {
        return defaultBugRate;
    }

    public void setDefaultBugRate() {
        this.defaultBugRate = 3;
    }

    public int getRate() {        return rate;    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int fixedBugs,int defaultBugRate) {
        this.bonus = fixedBugs*defaultBugRate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int bonus,int rate) {
        this.salary = (bonus+rate)*(random.nextBoolean()?2:0);
    }


    static void print(Developer developer) {
        System.out.println("Employee{" +
                "id=" + developer.id +
                ", name='" + developer.name + '\'' +
                ", age=" + developer.age +
                ", salary=" + developer.salary +
                ", gender='" + developer.gender + '\'' +
                ", fixedBugs=" + developer.fixedBugs +
                ", bonus=" + developer.bonus +
                '}');
    }

}