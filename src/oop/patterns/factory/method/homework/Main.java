package oop.patterns.factory.method.homework;

public class Main {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza pizza1 = pizzaFactory.getPizza(3);
        System.out.println(pizza1.getDetectedPizza());
    }
}
