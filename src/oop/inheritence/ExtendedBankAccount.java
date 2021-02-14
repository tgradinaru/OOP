package oop.inheritence;

public class ExtendedBankAccount extends BankAccount {
    float annualInterestRate;

    public void addMonthlyInterest() {
        this.balance += this.balance * annualInterestRate / 12;
    }

    public ExtendedBankAccount(float balance, float annualInterestRate) { //constructor
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
}
