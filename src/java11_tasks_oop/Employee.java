package java11_tasks_oop;

public class Employee {

    public String name, jobTittle;
    public int age;
    public char gender;
    public double salary;

    public Employee(String name, String jobTittle, int age, char gender, double salary) {
        this.name = name;
        this.jobTittle = jobTittle;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTittle='" + jobTittle + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }

    public void work(){

        System.out.println(jobTittle + " " + name + " is working");

    }


}
