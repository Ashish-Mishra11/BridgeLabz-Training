package com.inheritance.multilevel.onlineretail;

public class OnlineRetailOrderManagementDriver {
	public static void main(String[] args) {

        Order o1 = new Order("ORD101", "01-09-2025");
        Order o2 = new ShippedOrder("ORD102", "02-09-2025", "TRK5678");
        Order o3 = new DeliveredOrder("ORD103", "03-09-2025", "TRK7890", "05-09-2025");

        System.out.println(o1.getOrderStatus());
        System.out.println(o2.getOrderStatus());
        System.out.println(o3.getOrderStatus());
    }

}
