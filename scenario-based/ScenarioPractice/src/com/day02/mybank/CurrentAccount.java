package com.day02.mybank;
class CurrentAccount extends Account {

    private double interestRate = 2;

    public CurrentAccount(int accountNumber) {
        super(accountNumber);
    }

    public CurrentAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }
}
