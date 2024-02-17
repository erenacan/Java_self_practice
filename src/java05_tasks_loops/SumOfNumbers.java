package java05_tasks_loops;

public class SumOfNumbers {
    public static void main(String[] args) {

        int number = 100;
        int result = 0;

        for (int i = 1; i <= number; i++) {

            result += i;

        }

        System.out.println(result);


    }
}

/*
4. Create a class named SumOfNumbers and write a program to calculate the sum of all numbers between 1 and any given number.

				Example 1:
					   number = 100

				Output:
					  5050


				Example 2:
					    number = 50

				Output:
					  1275
 */