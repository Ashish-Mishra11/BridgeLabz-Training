package com.encapsulation.bankingsystem;
import java.util.ArrayList;
import java.util.List;

public class BankingSystemDriver {
	public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();

        BankAccount a1 = new SavingsAccount("SA101", "Anita", 50000);
        BankAccount a2 = new CurrentAccount("CA202", "Rahul", 80000);

        accounts.add(a1);
        accounts.add(a2);

        for (BankAccount account : accounts) {
            double interest = account.calculateInterest();
            double loanEligibility = ((Loanable) account).calculateLoanEligibility();

            System.out.println("Account Holder: " + account.getHolderName());
            System.out.println("Interest: " + interest);
            System.out.println("Loan Eligibility: " + loanEligibility);
            System.out.println();
        }
    }

}
