package All_employees;

public class Employee {
    public long id;
    public String name;
    public int age;
    public int salary;
    public String gender;
    public int fixedBugs;
    public int defaultBugRate;
    public int bonus;


    public Employee(long id,String  name,int age,int salary,String gender,int fixedBugs) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.fixedBugs = fixedBugs;
    }

    public Employee(){}

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
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
    public int getBonus() {
        return bonus;
    }

    public void setBonus(int fixedBugs,int defaultBugRate) {
        this.bonus = fixedBugs*defaultBugRate;
    }



    static void print(Employee employee) {
        System.out.println("Employee{" +
                "id=" + employee.id +
                ", name='" + employee.name + '\'' +
                ", age=" + employee.age +
                ", salary=" + employee.salary +
                ", gender='" + employee.gender + '\'' +
                ", fixedBugs=" + employee.fixedBugs +
                ", bonus=" + employee.bonus +
                '}');
    }

}