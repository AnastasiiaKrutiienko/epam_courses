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
        System.out.println("number = " + number);
        System.out.println("numberR = " + numberR);
        System.out.println("result = " + result);

        //

        int pounds = 500;
        double kilog = pounds*0.453592;
        int kgOnly = (int) kilog;
        double grams = (kilog - kgOnly)*1000;
        int gOnly = (int) grams;
        System.out.println("Task2");
        System.out.println("pounds = " + pounds + " lbs");
        System.out.println("result = " + kgOnly + " kg " + gOnly + " g");

        //
        int start = 10000;
        double percent = 12.5;
        int period = 30;
        int days = 365;
        int exp = 12;
        double middle = 1 + percent*period/100/days;
        double sum = start*Math.pow(middle, exp);
        double money = (int) sum;
        System.out.println("Task3");
        System.out.println("start = " + start + "UAH");
        System.out.println("result = " + money + " UAH");

    }
}
