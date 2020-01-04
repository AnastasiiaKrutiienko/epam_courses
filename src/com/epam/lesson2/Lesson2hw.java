package com.epam.lesson2;

/**
 * Created by Anastasiia 03.01.20
 */

public class Lesson2hw {
    public static void main(String[] arg) {
        int a = 4;
        int b = 7;
        int c = 3;
        int number = a*100 + b*10 + c;
        int numberR = c*100 + b*10 + a;
        int result = number - numberR;
        System.out.println("Task1");
        System.out.println("Number = " + number);
        System.out.println("New number = " + numberR);
        System.out.println("Result = " + result);

        //

        int pounds = 500;
        double kilograms = pounds*0.453592;
        int kgOnly = (int) kilograms;
        double grams = (kilograms - kgOnly)*1000;
        int gOnly = (int) grams;
        System.out.println("Task2");
        System.out.println("Pounds = " + pounds + " lbs");
        System.out.println("Kilograms = " + kgOnly + " kg " + gOnly + " g");

        //
        int initialDepositAmount = 10000;
        double annualInterestRate = 12.5;
        int depositCapitalizationPeriod = 30;
        int daysInAYear = 365;
        int numberOfCapitalizationOperations = 12;
        double middleSum = 1 + annualInterestRate*depositCapitalizationPeriod/100/daysInAYear;
        double sum = initialDepositAmount*Math.pow(middleSum, numberOfCapitalizationOperations);
        double money = (int) sum;
        System.out.println("Task3");
        System.out.println("Original principal sum = " + initialDepositAmount + "UAH");
        System.out.println("New principal sum = " + money + " UAH");

    }
}
