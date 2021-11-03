package All_employees;


public class Manager {
    public long id;
    public String name;
    public int age;
    public int salary;
    public String gender;




    public Manager(long id, String  name, int age, int salary, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;

    }

    public Manager(){}

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




    static void print(Manager manager) {
        System.out.println("Employee{" +
                "id=" + manager.id +
                ", name='" + manager.name + '\'' +
                ", age=" + manager.age +
                ", salary=" + manager.salary +
                ", gender='" + manager.gender + '\'' +
                '}');
    }

}