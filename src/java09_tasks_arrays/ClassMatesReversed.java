package java09_tasks_arrays;

public class ClassMatesReversed {

    public static void main(String[] args) {

        String [] classmates = {"Sami Sosa", "Chris Barrientos",
                "William Torres", "Medi Messoudi", "Julio Ortiz", "Eren Acan",
                "Mayenci Mendoza", "John Omar", "Jesse Lujano", "Jack Cotrell"};


        for (int i = 0; i < classmates.length; i++) {
            String name = classmates[i];
            String reverseName = "";

            for (int j = name.length() - 1; j >= 0; j--) {
                reverseName = reverseName + name.charAt(j);
            }

            System.out.println(reverseName);

        }


    }

}
