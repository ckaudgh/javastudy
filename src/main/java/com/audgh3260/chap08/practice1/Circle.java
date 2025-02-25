package com.audgh3260.chap08.practice1;

public class Circle extends Shape implements Resizable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void resize(double factor) {
        radius *= factor;
    }

    @Override
    public String toString() {
        return "Shape: Circle\nArea: " + calculateArea() + "\nPerimeter: " + calculatePerimeter();
    }
}