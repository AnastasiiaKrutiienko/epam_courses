package com.epam.lesson7;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);

        this.radius = radius;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                " radius = " + this.radius;
    }

    @Override
    public double calcArea() {
        // A = π r^2
        return Math.PI * Math.pow(radius, 2);
    }
}