package com.inheritance.hierarchical.bankaccounttypes;

public class BankAccountHierarchyDriver {
	public static void main(String[] args) {

        BankAccount a1 = new SavingsAccount("SB101", 50000, 4.5);
        BankAccount a2 = new CheckingAccount("CA102", 30000, 10000);
        BankAccount a3 = new FixedDepositAccount("FD103", 100000, 24);

        a1.displayAccountType();
        a2.displayAccountType();
        a3.displayAccountType();
    }

}
