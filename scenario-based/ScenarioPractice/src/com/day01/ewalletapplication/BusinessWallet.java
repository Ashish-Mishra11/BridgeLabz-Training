package com.day01.ewalletapplication;
public class BusinessWallet extends Wallet {

    public BusinessWallet(double balance, boolean referralBonus) {
        super(balance, referralBonus);
    }

    @Override
    public void transferTo(User receiver, double amount) {
        double tax = amount * 0.02; // 2% tax
        double totalAmount = amount + tax;

        if (totalAmount <= getBalance()) {
            debit(totalAmount);
            receiver.getWallet().credit(amount);
            System.out.println("Transfer successful from Business Wallet (Tax Applied)");
        } else {
            System.out.println("Insufficient balance after tax");
        }
    }
}
