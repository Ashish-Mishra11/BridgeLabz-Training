package com.day01.ewalletapplication;
import java.util.ArrayList;

public abstract class Wallet implements Transferrable {

    private double balance; // Encapsulation
    protected ArrayList<Transaction> history = new ArrayList<>();

    // Constructor with optional referral bonus
    public Wallet(double initialBalance, boolean referralBonus) {
        balance = initialBalance;
        if (referralBonus) {
            balance += 100; // referral credit
            history.add(new Transaction("Referral Bonus", 100));
        }
    }

    public double getBalance() {
        return balance;
    }

    protected void credit(double amount) {
        balance += amount;
        history.add(new Transaction("Credit", amount));
    }

    protected void debit(double amount) {
        balance -= amount;
        history.add(new Transaction("Debit", amount));
    }

    public void showTransactions() {
        for (Transaction t : history) {
            System.out.println(t);
        }
    }
}
