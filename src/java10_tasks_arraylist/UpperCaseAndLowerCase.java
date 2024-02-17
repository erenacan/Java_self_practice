package java10_tasks_arraylist;

public class UpperCaseAndLowerCase {

    public static void main(String[] args) {

        String str = "JAVA java";
        int upperCase = 0;
        int lowerCase = 0;


        for (char each : str.toCharArray()) {

            if (Character.isUpperCase(each)) {

                upperCase++;

            }

            else if (Character.isLowerCase(each)) {

                lowerCase++;
            }

        }

        System.out.println(lowerCase == upperCase);


    }}
