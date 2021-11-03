package All_employees;

public class Designer {
    public long id;
    public String name;
    public int age;
    public int salary;
    public String gender;
    public int workedDays;
    public int bonus;
    public int rate;

    public Designer(long id, String  name, int age, int salary, String gender, int workedDays) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.workedDays = workedDays;
    }

    public Designer(){}

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

    public int getWorkedDays() {
        return workedDays;
    }

    public void setWorkedDays(int workedDays) {
        this.workedDays = workedDays;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int fixedBugs,int defaultBugRate) {
        this.bonus = rate * workedDays;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary+bonus;
    }


    static void print(Designer designer) {
        System.out.println("Employee{" +
                "id=" + designer.id +
                ", name='" + designer.name + '\'' +
                ", age=" + designer.age +
                ", salary=" + designer.salary +
                ", gender='" + designer.gender + '\'' +
                ", workedDays=" + designer.workedDays +
                ", bonus=" + designer.bonus +
                '}');
    }

}