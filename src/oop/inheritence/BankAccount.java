package oop.inheritence;

public class BankAccount {
    public float balance;

    public void addMoney(float x) {
        this.balance += x;
    }

    public boolean withdrawal(float x) {
        return this.balance >= x;
    }

    public float getBalance() {
        return balance;
    }
}