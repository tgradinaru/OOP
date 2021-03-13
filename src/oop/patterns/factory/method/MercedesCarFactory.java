package oop.patterns.factory.method;

public class MercedesCarFactory { //construieste obiecte - aceasta este metoda Factory pt design patterns

    public Car order(int budget) {
        if (budget < 20000) {
            return new Glk();
        }
        if (budget < 40000) {
            return new Glc();
        }

        return new Gle();

    }
}
