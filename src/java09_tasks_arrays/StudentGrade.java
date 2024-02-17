package java09_tasks_arrays;

import java.util.Arrays;

public class StudentGrade {

    public static void main(String[] args) {

        String[] studentNames = {"Anna", "Nancy", "Sarah"};
        int[] scores = {90, 75, 80};
        char[] grades = {'A', 'C', 'B'};

        for (int i = 0; i < grades.length; i++) {


            if (scores[i] >= 90) {

                grades[i] = 'A';

            } else if (scores[i] >= 80) {
                grades[i] = 'B';

            } else {
                grades[i] = 'C';
            }

            System.out.println(studentNames[i] +"'s score is "+ scores[i] +", and grade is "+ grades[i]);

        }

    }
}
