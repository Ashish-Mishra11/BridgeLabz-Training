package com.inheritance.hierarchical.bankaccounttypes;

public class CheckingAccount extends BankAccount {
	private double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Checking Account with withDrawalLimit is: "+ withdrawalLimit);
    }

}
