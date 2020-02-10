package com.epam.lesson7;

public class Main {
    public static void printAreas(Shape[] arrayOfShapes) {
        for (Shape shape : arrayOfShapes) {
            System.out.println("shape: " + shape.toString() + " area: " + shape.calcArea());
        }
    }

    public static double getAreasOfShapes(Shape[] arrayOfShapes) {
        double sumOfAreas = 0;

        for (Shape shape : arrayOfShapes) {
            sumOfAreas = sumOfAreas + shape.calcArea();
        }

        return sumOfAreas;
    }

    public static double getAreasOfParticularShape(Shape[] arrayOfShapes, Shape figure) {
        double sumOfAreas = 0;

        for (Shape shape : arrayOfShapes) {
            if (shape.getClass().equals(figure.getClass())) {
                sumOfAreas = sumOfAreas + shape.calcArea();
            }
        }

        return sumOfAreas;
    }

    public static void main(String[] arg) {
        Shape[] arrayOfShapes = {
                new Rectangle("green", 10, 9 ),
                new Rectangle("red", 12, 8 ),
                new Rectangle("blue", 10, 7 ),
                new Rectangle("green", 9, 5 ),
                new Circle("green", 9),
                new Circle("red", 7),
                new Circle("blue", 2),
                new Triangle("blue", 3, 4, 5),
                new Triangle("blue", 1, 5, 5),
        };

        printAreas(arrayOfShapes);

        double sumOfAreas = getAreasOfShapes(arrayOfShapes);
        System.out.println("sum of areas = " + sumOfAreas);

        double sumOfRectangles = getAreasOfParticularShape(arrayOfShapes, new Rectangle("red", 1, 2));
        double sumOfCircles = getAreasOfParticularShape(arrayOfShapes, new Circle("red", 2));
        double sumOfTriangles = getAreasOfParticularShape(arrayOfShapes, new Triangle("red", 2, 1, 2));

        System.out.println("sum of rectangles areas = " + sumOfRectangles);
        System.out.println("sum of circles areas = " + sumOfCircles);
        System.out.println("sum of triangles areas = " + sumOfTriangles);
    }
}
