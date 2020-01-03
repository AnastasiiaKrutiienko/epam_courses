package com.epam.lesson2;

/**
 * Created by Anastasiia 26.12.19
 */

public class Lesson2 {
    public static void main(String[] arg) {
        int number1 = -23;
        int number2 = 100;
        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;

        System.out.println("number1=" + number1);
        System.out.println("number2=" + number2);

        //

        long currentTime = System.currentTimeMillis() / 1000;
        long ss = currentTime % 60;
        long mm = (currentTime / 60) % 60;
        long hh = currentTime / (60 * 60) % 24;
        long days = currentTime / (60 * 60 * 24);
        System.out.println(days + ":" + hh + ":" + mm + ":" + ss);
    }
}