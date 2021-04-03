package oop.patterns.factory.abstractFactory;

public class AutoDealer {

    public Car order(Budget budget, boolean isElectric) {
        CarFactory carFactory;

        if (isElectric) {
            //aici o sa vreau sa comand masini electrice
            carFactory = new TeslaCarFactory();
        } else {
            //aici comand masini ne-electrice
            carFactory = new MercedesCarFactory();
        }

        return carFactory.order(budget);
    }
}
