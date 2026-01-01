package com.inheritance.hierarchical.bankaccounttypes;

public class FixedDepositAccount extends BankAccount {
	private int tenureInMonths;

    FixedDepositAccount(String accountNumber, double balance, int tenureInMonths) {
        super(accountNumber, balance);
        this.tenureInMonths = tenureInMonths;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Fixed Deposit Account: "+tenureInMonths);
    }

}
