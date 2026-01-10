package com.day07.foodloop;

public class VegItem extends FoodItem {

    public VegItem(String name, double price, boolean available) {
        super(name, "Veg", price, available);
    }

    @Override
    public double applyDiscount(double total) {
        if (total > 300) {
            return total - 50;
        }
        return total;
    }
}
