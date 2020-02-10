package com.epam.lesson7;

public class Shape {
    public String color;

    public Shape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return  this.getClass().getSimpleName() +
                " color = " + color;
    }

    public double calcArea () {
        return 0.0;
    }

}
