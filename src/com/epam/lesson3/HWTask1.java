package com.epam.lesson3;

public class HWTask1 {
    public static void main(String[] arg) {
         int row = 9;
         int i = 0;
         int starsCount = 0;
         while (i < row) {
             System.out.println("*");
             if (i < 4) {
                 starsCount++;
             } else {
                 starsCount--;
             }
             int innerStarsCount = 0;
             while (innerStarsCount < starsCount) {
                 innerStarsCount++;
                 System.out.print("* ");
             }
             i++;
         }
            System.out.println();

    }
}

