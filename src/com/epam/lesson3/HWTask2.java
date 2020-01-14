package com.epam.lesson3;

public class HWTask2 {
    public static void main(String[] arg) {
        int row = 5;
        int i = 0;
        int spaceCount = 0;
        int starsCount = 5;
        while (i < row) {
            int innerSpaceCount = 5 - spaceCount;
            int innerStarsCount = starsCount;
            System.out.println("");
            while (innerSpaceCount < 5) {
                System.out.print("  ");
                innerSpaceCount++;
            }
            while (innerStarsCount > 0) {
                System.out.print("* ");
                innerStarsCount--;
            }
            spaceCount++;
            starsCount--;
            i++;
        }
        System.out.println();
    }
}
