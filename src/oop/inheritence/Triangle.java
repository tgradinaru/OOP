package oop.inheritence;

public class Triangle extends GeometricFigure {    /// Clasa copil a Geometric figure
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {  /// CONSTRUCTOR
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double calculateArea() {
        double p;
        p = side1 + side2 + side3;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }
}
