package java10_tasks_arraylist;

public class LettersDigitsSpecialChars {

    public static void main(String[] args) {

        String str = "Wooden Spoon123!";
        String digits = "",
                letters = "",
                specialChars = "";

        for (char each1 : str.toCharArray()) {

            if (Character.isLetter(each1)) {
                letters += each1;
            }


        }
        System.out.println();

        for (char each2 : str.toCharArray()) {

            if (Character.isDigit(each2)) {
                digits += each2;
            }

        }

        for (char each3 : str.toCharArray()) {

            if (!Character.isDigit(each3) && !Character.isLetter(each3)) {
                specialChars += each3;
            }
        }


        System.out.println("Letters = " + letters);
        System.out.println("Digits = " + digits);
        System.out.println("specialChars = " + specialChars);

    }
}