package java09_tasks_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MoveTheZeros {

    public static void main(String[] args) {

        int[] array = {10, 0, 5, 0, 1, 0};

        Arrays.sort(array);


        int[] reverse = new int [array.length];

        for (int i = array.length - 1, j=0; i >= 0; i--, j++) {

            reverse[j] = array[i];

        }

        System.out.println(Arrays.toString(reverse));








}}