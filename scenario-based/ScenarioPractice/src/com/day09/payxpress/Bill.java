package com.day09.payxpress;
class Bill implements IPayable {

    protected String type;
    protected double amount;
    protected String dueDate;
    private boolean isPaid;

    public Bill(String type, double amount, String dueDate) {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = false;
    }

    public boolean isPaid() {
        return isPaid;
    }

    protected void markPaid() {
        isPaid = true;
    }

    public double calculateLateFee(double penalty) {
        return amount + penalty;
    }

    public void pay(double amount) {
        if (!isPaid) {
            System.out.println(type + " bill paid amount " + amount);
            markPaid();
        } else {
            System.out.println(type + " bill already paid");
        }
    }

    public void sendReminder() {
        System.out.println("Bill reminder");
    }
}
