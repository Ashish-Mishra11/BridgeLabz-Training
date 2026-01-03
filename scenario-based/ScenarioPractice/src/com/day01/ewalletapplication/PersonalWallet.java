package com.day01.ewalletapplication;
public class PersonalWallet extends Wallet {

    public PersonalWallet(double balance, boolean referralBonus) {
        super(balance, referralBonus);
    }

    @Override
    public void transferTo(User receiver, double amount) {
        if (amount <= getBalance()) {
            debit(amount);
            receiver.getWallet().credit(amount);
            System.out.println("Transfer successful from Personal Wallet");
        } else {
            System.out.println("Insufficient balance in Personal Wallet");
        }
    }
}
