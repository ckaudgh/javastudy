package com.audgh3260.chap08.practice1;

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