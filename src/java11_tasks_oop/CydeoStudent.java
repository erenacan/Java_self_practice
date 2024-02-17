package java11_tasks_oop;

public class CydeoStudent {

    public String name;
    public int age,id,bathNumber, groupNumber;
    public char grade;
    public static String schoolName = "Cydeo School";
    public static String programmingLanguage = "Java";

    public CydeoStudent(String name, int age, int id, int bathNumber, int groupNumber, char grade) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.bathNumber = bathNumber;
        this.groupNumber = groupNumber;
        this.grade = grade;
    }

     public void study(){
         System.out.println(name + " is studying");
     }
     public void attendClass() {
         System.out.println(name + " is attending the live class.");
     }
     public void printSchoolName(){
         System.out.println(schoolName);
     }
     public void printProgLanguage(){
         System.out.println(programmingLanguage);
     }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", bathNumber=" + bathNumber +
                ", groupNumber=" + groupNumber +
                ", grade=" + grade +
                '}';
    }
}
