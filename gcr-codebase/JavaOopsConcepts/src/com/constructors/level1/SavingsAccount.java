package com.constructors.level1;

class SavingsAccount extends BankAccount {


    // Constructor
    SavingsAccount(int accountNumber, String accountHolder,
                   double balance) {
        super(accountNumber, accountHolder, balance);
    }

    void displayDetails() {
        // public variable
        System.out.println("Account Number : " + accountNumber);

        // protected variable
        System.out.println("Account Holder : " + accountHolder);

        // private variable via public method
        System.out.println("Balance        : ₹" + getBalance());

    }

    public static void main(String[] args) {

        SavingsAccount sa =
                new SavingsAccount(12345, "Ashish", 50000);

        sa.displayDetails();

        sa.setBalance(55000);
        System.out.println("Updated Balance: ₹" + sa.getBalance());
    }
}

