package com.day07.foodloop;

public class NonVegItem extends FoodItem {

    public NonVegItem(String name, double price, boolean available) {
        super(name, "Non-Veg", price, available);
    }

    @Override
    public double applyDiscount(double total) {
        if (total > 500) {
            return total - 100;
        }
        return total;
    }
}
