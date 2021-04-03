package oop.patterns.factory.abstractFactory;

public class TeslaCarFactory extends CarFactory {
    @Override
    public Car order(Budget budget) {
        if(budget.getCurrency()!= Currency.USD){
            throw new IllegalArgumentException("Primim doar USD aici");
        }
        if (budget.getValue() < 20000) {
            return new Tesla1();
        }
        if (budget.getValue() < 50000) {
            return new Tesla2();
        }
        return new Tesla3();

    }
}
