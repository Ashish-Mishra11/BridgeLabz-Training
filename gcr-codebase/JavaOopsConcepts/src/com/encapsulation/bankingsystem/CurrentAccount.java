package com.encapsulation.bankingsystem;

public class CurrentAccount extends BankAccount implements Loanable {
	CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.02;
    }

    @Override
    public void applyForLoan(double amount) {
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 3;
    }

}
