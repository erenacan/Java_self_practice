package java11_tasks_oop;

public class CydeoStudentClients {

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("sami", 33,12345,54321,3,'A');

        System.out.println(student1);

        student1.study();
        student1.attendClass();
        student1.printSchoolName();
        student1.printProgLanguage();

    }

}
