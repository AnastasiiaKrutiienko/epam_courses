package com.epam.lesson5;
import java.util.Arrays;

public class Lesson5HW {
    public static int[] getRandom(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 10) - 5);
        }

        return array;
    }

    public static int[] getSumArray(int[] firstArray, int[] secondArray) {
        int[] resultArray = new int [firstArray.length];

        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = firstArray[i] + secondArray[i];
        }

        return resultArray;
    }

    public static int[][] separateForNegAndPos(int[] array) {
        int[] positive = new int[array.length];
        int[] negative = new int[array.length];
        int[][] separatedArray = new int[2][];
        int countPos = 0;
        int countNeg = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0 ) {
                positive[countPos++] = array[i];
            } else {
                negative[countNeg++] = array[i];
            }
        }

        separatedArray[0] = Arrays.copyOf(positive, countPos);
        separatedArray[1] = Arrays.copyOf(negative, countNeg);

        return separatedArray;
    }

    public static void main(String[] arg) {
        /** Task 1 */
        int[] firstArray = getRandom(new int[20]);
        int[] secondArray = getRandom(new int[20]);

        int[] resultArray = getSumArray(firstArray, secondArray);

        System.out.println("first    " + Arrays.toString(firstArray));
        System.out.println("second   " + Arrays.toString(secondArray));
        System.out.println("sum      " + Arrays.toString(resultArray));

        /** Task 2 */
        int[][] separatedArray = separateForNegAndPos(resultArray);

        System.out.println("positive " + Arrays.toString(separatedArray[0]));
        System.out.println("negative " + Arrays.toString(separatedArray[1]));
    }

}
