package com.encapsulation.onlinefooddeliverysystem;
import java.util.ArrayList;
import java.util.List;

public class OnlineFoodDeliverySystemDriver {
	public static void main(String[] args) {

        List<FoodItem> order = new ArrayList<>();

        FoodItem f1 = new VegItem("Paneer Butter Masala", 200, 2);
        FoodItem f2 = new NonVegItem("Chicken Biryani", 250, 1);

        order.add(f1);
        order.add(f2);

        processOrder(order);
    }

    private static void processOrder(List<FoodItem> items) {
        for (FoodItem item : items) {
            item.getItemDetails();
            System.out.println("Total Price: " + item.calculateTotalPrice());
            System.out.println();
        }
    }

}
