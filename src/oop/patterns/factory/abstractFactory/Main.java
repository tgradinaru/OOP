package oop.patterns.factory.abstractFactory;

public class Main {
    public static void main(String[] args) {
        AutoDealer autoDealer = new AutoDealer();

        Budget budget1 = new Budget(33333, Currency.EURO);
        Car car1 = autoDealer.order(budget1,true);
        System.out.println(car1.getModel());

        Budget budget2 = new Budget(33333,Currency.USD);
        Car car2 = autoDealer.order(budget2, false);
        System.out.println(car2.getModel());
    }
}
