package oop.patterns.factory.method;

public class Main {
    public static void main(String[] args) {
        MercedesCarFactory mercedesCarFactory = new MercedesCarFactory();
        Car car1 = mercedesCarFactory.order(25000);
        System.out.println(car1.getModel());
    }
}
