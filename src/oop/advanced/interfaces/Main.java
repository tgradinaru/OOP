package oop.advanced.interfaces;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(8, 4);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        Shape shape = rectangle;

        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());

        shape.print();
        Shape square = new Square(5);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        square.print();

    }
}
