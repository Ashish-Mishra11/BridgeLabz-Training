package com.day09.payxpress;
class WaterBill extends Bill {

    public WaterBill(double amount, String dueDate) {
        super("Water", amount, dueDate);
    }

    public void sendReminder() {
        System.out.println("Water bill payment pending before " + dueDate);
    }
}
