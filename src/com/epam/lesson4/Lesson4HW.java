package com.epam.lesson4;

public class Lesson4HW {
    public static String getUniqueChars(String input) {
        int inputLength = input.length();
        int i = 0;
        String uniqueChars = "";

        while (i < inputLength) {
            char currentSymbol = input.charAt(i);
            if (uniqueChars.indexOf(currentSymbol) == -1) {
                uniqueChars = uniqueChars + currentSymbol;
            }
            i++;
        }

       return uniqueChars;
    }

    public static String getNumberInBinaryFormat(int number) {
        String binaryCode = "";
        while (number > 0) {
            int binary = number % 2;
            binaryCode = binaryCode + binary;
            number = number / 2;
        }

        return binaryCode;
    }

    public static void main(String[] arg) {
        /*  Task 1  */
        String str1 = "aabbcc";
        String str2 = "ddeeff";

        String firstString = getUniqueChars(str1);
        String secondString = getUniqueChars(str2);

        System.out.println(firstString);
        System.out.println(secondString);

        /*  Task2  */
        int number1 = 13;
        int number2 = 22;
        String firstBinaryCode = getNumberInBinaryFormat(number1);
        String secondBinaryCode = getNumberInBinaryFormat(number2);

        System.out.println(firstBinaryCode);
        System.out.println(secondBinaryCode);
    }
}

