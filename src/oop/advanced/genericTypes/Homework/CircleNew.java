package oop.advanced.genericTypes.Homework;

public abstract class CircleNew extends GeometricObject {
    private Double dimension;

    public CircleNew(Double dimension) {
        this.dimension = dimension;
    }

    public Double getPerimeter() {
        return 2 * Math.PI * dimension;
    }

    public Double getArea() {
        return Math.PI * dimension * dimension;
    }

    public Double getRadius() {
        return dimension;
    }

    public void setOneDimension(Double radius) {
        this.dimension = radius;
    }
}
