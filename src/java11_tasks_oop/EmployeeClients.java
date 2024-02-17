package java11_tasks_oop;

public class EmployeeClients {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Cydeo", "Engineer", 25, 'M', 120_000);

        emp1.work();

        System.out.println(emp1);

    }

}
