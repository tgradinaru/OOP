package oop.advanced.inheritence;

public class Circle extends GeometricFigure {   /// Clasa copil a Geometric figure

    private int radius;

    public Circle(int radius) {     //CONSTRUCTOR
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
