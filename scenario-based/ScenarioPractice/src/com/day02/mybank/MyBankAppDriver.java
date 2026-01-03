package com.day02.mybank;
import java.util.Scanner;

public class MyBankAppDriver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account type");
        System.out.println("1 for Savings Account");
        System.out.println("2 for Current Account");
        int choice = sc.nextInt();

        System.out.println("Enter account number");
        int accNo = sc.nextInt();

        System.out.println("Enter opening balance");
        double balance = sc.nextDouble();

        Account account;

        if (choice == 1) {
            account = new SavingsAccount(accNo, balance);
        } else {
            account = new CurrentAccount(accNo, balance);
        }

        account.checkBalance();

        System.out.println("Enter deposit amount");
        double deposit = sc.nextDouble();
        account.deposit(deposit);

        System.out.println("Enter withdrawal amount");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);

        account.checkBalance();

        double interest = account.calculateInterest();
        System.out.println("Calculated interest is " + interest);

        sc.close();
    }
}
