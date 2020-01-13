package com.epam.lesson3;

public class Lesson3 {
    public static void main(String[] arg) {
        /* Task 1
              int val1 = 0;
              int val2 = 10;
              int val3 = 100;
               int maxValue;
               if ((val1 > val2) && (val1 > val3)) {
                 maxValue = val1;
             } else if (val2 > val1 && val2 val2 > val3) {
                 maxValue = val2;
               } else {
                  maxValue = val3;
              }
               System.out.println("Max = " + maxValue);

        */

        /*  Task 2 */

        int line = 1;
        while (line <= 8) {
            int number = line;
            while (number > 0) {
                System.out.print(number + " ");
                number--;
            }
            line++;
            System.out.println();

        }

        /*  Task 3 */

        int count = 10;
        int number1 = 1;
        while (count >= 1) {
            if (number1 % 3 == 0 || number1 % 4 == 0) {
                System.out.println(number1);
                count--;
            }
            number1++;
        }


        /* Task 4 */

        System.out.println("* |  1  2  3  4  5  6  7  8  9");
        System.out.println("------------------------------");
        int row = 1;
        while (row <= 9) {
            int num = 1;
            System.out.print(row + " |");
            while (num <= 9) {
                int result = row * num;
                System.out.print((result < 10 ? "  " : " ") + result);
                num++;
            }
            row++;
            System.out.println( );
        }

    }
}
