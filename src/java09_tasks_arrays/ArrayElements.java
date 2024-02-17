package java09_tasks_arrays;


import java.util.Arrays;

    public class ArrayElements {

        public static void main(String[] args) {

            int[] numbers = new int[100];

            for (int i = 0; i < numbers.length; i++) {

                numbers[i] = i + 1;


            }

            System.out.println(Arrays.toString(numbers));

            int[] reverseNumbers = new int[100];

            for (int i = numbers.length - 1, j = 0; i >= 0; i--, j++) {

                reverseNumbers[j] = numbers[i];

            }

            System.out.println(Arrays.toString(reverseNumbers));

            for (int i : numbers) {

                if (i % 5 == 0) {

                    System.out.print(i + " ");
                }


            }


        }







    }




