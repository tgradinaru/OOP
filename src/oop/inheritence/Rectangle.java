package oop.inheritence;

public class Rectangle extends GeometricFigure {   /// Clasa copil a Geometric figure
    private int side1;
    private int side2;

    public Rectangle(int side1, int side2) { /// CONSTRUCTOR
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (side1 + side2);
    }

    @Override
    public double calculateArea() {
        return side1 * side2;
    }
}
