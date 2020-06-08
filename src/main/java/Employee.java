

public class Employee {
    protected String name;
    protected String position;
    protected String email;
    protected String phone;
    protected int salary;
    protected int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    protected void employinfo() {
        System.out.println("name " + name + "; Должность " + position + "; email: " + email + "; phone: " + phone+ "; salary: " + salary+ "; age: " + age);
    }



}