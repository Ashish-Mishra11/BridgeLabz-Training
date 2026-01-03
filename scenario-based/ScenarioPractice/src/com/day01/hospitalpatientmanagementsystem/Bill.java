package com.day01.hospitalpatientmanagementsystem;

public class Bill implements Payable {
	private double baseAmount;
    private double tax = 0.05;       // 5% tax
    private double discount = 0.10;  // 10% discount

    public Bill(double baseAmount) {
        this.baseAmount = baseAmount;
    }

    @Override
    public double calculatePayment() {
        double discountedAmount = baseAmount - (baseAmount * discount);
        return discountedAmount + (discountedAmount * tax);
    }

}
