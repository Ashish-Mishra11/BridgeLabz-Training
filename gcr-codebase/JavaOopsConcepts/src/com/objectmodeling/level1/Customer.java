package com.objectmodeling.level1;

public class Customer {
	String name;
    double balance;

    public Customer(String name) {
        this.name = name;
        this.balance = 0;
    }

    public void viewBalance() {
        System.out.println(name + "'s Balance: ₹" + balance);
    }
	

}
