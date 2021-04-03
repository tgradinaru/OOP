package oop.patterns.factory.abstractFactory;

public class Budget {
    private int value;
    private Currency currency;

    public Budget(int value, Currency currency) {
        this.value = value;
        this.currency = currency;
    }

    public int getValue() {
        return value;
    }

    public Currency getCurrency() {
        return currency;
    }
}
