package com.audgh3260.chap08.practice1;

class Circle extends Shape implements Resizable {
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

class Rectangle extends Shape implements Resizable {
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

class Triangle extends Shape implements Resizable {
    private double base, height, side1, side2, side3;

    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public void resize(double factor) {
        base *= factor;
        height *= factor;
        side1 *= factor;
        side2 *= factor;
        side3 *= factor;
    }

    @Override
    public String toString() {
        return "Shape: Triangle\nArea: " + calculateArea() + "\nPerimeter: " + calculatePerimeter();
    }
}

class ShapeManager {
    private Shape[] shapes = new Shape[10];
    private int index = 0;

    public void addShape(Shape shape) {
        if (index >= shapes.length) {
            Shape[] newShapes = new Shape[shapes.length * 2];
            System.arraycopy(shapes, 0, newShapes, 0, shapes.length);
            shapes = newShapes;
        }
        shapes[index++] = shape;
    }

    public void removeShape(Shape shape) {
        for (int i = 0; i < index; i++) {
            if (shapes[i] == shape) {
                System.arraycopy(shapes, i + 1, shapes, i, index - i - 1);
                shapes[--index] = null;
                break;
            }
        }
    }

    public void printAllShapes() {
        for (int i = 0; i < index; i++) {
            System.out.println(shapes[i]);
        }
    }

    public double getTotalArea() {
        double totalArea = 0;
        for (int i = 0; i < index; i++) {
            totalArea += shapes[i].calculateArea();
        }
        return totalArea;
    }

    public double getTotalPerimeter() {
        double totalPerimeter = 0;
        for (int i = 0; i < index; i++) {
            totalPerimeter += shapes[i].calculatePerimeter();
        }
        return totalPerimeter;
    }
}