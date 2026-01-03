package com.day02.mybank;
class SavingsAccount extends Account {

    private double interestRate = 4;

    public SavingsAccount(int accountNumber) {
        super(accountNumber);
    }

    public SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }
}
