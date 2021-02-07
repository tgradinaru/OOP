package oop.inheritence;

public class Square extends GeometricFigure {

    private int side;

    public Square(int side) {       //constructor
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return side * 4;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
