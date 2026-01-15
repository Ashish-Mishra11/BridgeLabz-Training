package com.day09.payxpress;
import java.util.Scanner;

public class PayXpressDriver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter bill type");
        System.out.println("1 Electricity");
        System.out.println("2 Water");
        System.out.println("3 Internet");

        int choice = sc.nextInt();

        System.out.println("Enter bill amount");
        double amount = sc.nextDouble();

        sc.nextLine();
        System.out.println("Enter due date");
        String dueDate = sc.nextLine();

        Bill bill = null;

        if (choice == 1) {
            bill = new ElectricityBill(amount, dueDate);
        } else if (choice == 2) {
            bill = new WaterBill(amount, dueDate);
        } else if (choice == 3) {
            bill = new InternetBill(amount, dueDate);
        } else {
            System.out.println("Invalid choice");
            return;
        }

        bill.sendReminder();

        System.out.println("Enter late fee penalty");
        double penalty = sc.nextDouble();

        double totalAmount = bill.calculateLateFee(penalty);
        System.out.println("Total amount to pay " + totalAmount);

        bill.pay(totalAmount);

        sc.close();
    }
}
