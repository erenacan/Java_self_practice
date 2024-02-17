package java09_tasks_arrays;

import java.sql.Array;
import java.util.Arrays;

public class ClassMatesInitials {

    public static void main(String[] args) {

        String[] classmates = {"Sami Sosa", "Chris Barrientos",
        "William Torres", "Medi Messoudi", "Julio Ortiz", "Eren Acan",
        "Mayenci Mendoza", "John Omar", "Jesse Lujano", "Jack Cotrell"};



        String[] initials = new String[classmates.length];

        for (int i = 0; i < initials.length; i++) {

        initials[i] = classmates[i].charAt(0) + "" + classmates[i].charAt(classmates[i].indexOf(" ") + 1);

        }

        System.out.println(Arrays.toString(initials));



    }

}
