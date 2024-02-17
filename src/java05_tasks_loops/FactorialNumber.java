package java05_tasks_loops;

public class FactorialNumber {

    public static void main(String[] args) {

        long num = 55;
        long result = 1;

        for (long i = num; i >= 1 ; i--) {

            result *= i;

        }

        System.out.print(result);

        }

    }



/*
5. Write a program that can return the factorial number of any given number.

				Example:
					  num = 5

				Output:
					  120

			(because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */