package com.objectmodeling.level1;

public class Customer1 {
	String name;

    public Customer1(String name) {
        this.name = name;
    }

    public void placeOrder(Order order) {
        System.out.println(name + " placed an order:");
        order.showOrderDetails();
    }

}
