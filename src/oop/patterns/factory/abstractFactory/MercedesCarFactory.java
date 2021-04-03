package oop.patterns.factory.abstractFactory;

public class MercedesCarFactory extends CarFactory{ //construieste obiecte - aceasta este metoda Factory pt design patterns
    @Override
    public Car order(Budget budget) {
        if(budget.getCurrency()==Currency.RON){
            throw new IllegalArgumentException("Nu primim Lei aici!");
        }
        if (budget.getValue() < 20000) {
            return new Glk();
        }
        if (budget.getValue() < 40000) {
            return new Glc();
        }
        return new Gle();

    }
}
