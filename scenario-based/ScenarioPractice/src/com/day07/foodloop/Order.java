package com.day07.foodloop;

import java.util.ArrayList;
import java.util.List;

public class Order implements IOrderable {

    private List<FoodItem> items;
    private double total;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(FoodItem item) {
        if (item.isAvailable()) {
            items.add(item);
        }
    }

    private void calculateTotal() {
        total = 0;
        for (FoodItem item : items) {
            total += item.getPrice();
        }

        if (!items.isEmpty()) {
            total = items.get(0).applyDiscount(total);
        }
    }

    @Override
    public void placeOrder() {
        calculateTotal();
        System.out.println("Order placed successfully");
        System.out.println("Total amount: " + total);
    }

    @Override
    public void cancelOrder() {
        items.clear();
        total = 0;
        System.out.println("Order cancelled");
    }
}
