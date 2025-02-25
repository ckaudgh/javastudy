package com.audgh3260.chap08.practice1;

public class Rectangle extends Shape implements Resizable {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public void resize(double factor) {
        width *= factor;
        height *= factor;
    }

    @Override
    public String toString() {
        return "Shape: Rectangle\nArea: " + calculateArea() + "\nPerimeter: " + calculatePerimeter();
    }
}
