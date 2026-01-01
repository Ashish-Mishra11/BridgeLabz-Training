package com.inheritance.hybrid.restaurantmanagement;

public class RestaurantManagementDriver {
	public static void main(String[] args) {

        Worker w1 = new Chef("John", 101, "Italian Cuisine");
        Worker w2 = new Waiter("Emma", 102, 5);

        w1.performDuties();
        w2.performDuties();
    }

}
