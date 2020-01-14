package com.epam.lesson3;

public class HWTask3 {
    public static void main(String[] arg) {
        int row = 5;
        int i = 0;
        int spaceCount = 4;
        int starsCount = 0;
        while (i < row) {
            int innerSpaceCount = spaceCount;
            int innerStarsCount = 5 - starsCount;
            System.out.println("");
            while (innerSpaceCount > 0){
                 System.out.print("  ");
                 innerSpaceCount--;
            }
            while (innerStarsCount <= 5) {
                System.out.print("* ");
                innerStarsCount++;
            }
            spaceCount--;
            starsCount++;
            i++;
        }
        System.out.println();
    }
}
