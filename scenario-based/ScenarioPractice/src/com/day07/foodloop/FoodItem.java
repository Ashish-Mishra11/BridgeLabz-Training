package com.day07.foodloop;

public class FoodItem {
    private String name;
    private String category;
    protected double price;
    private boolean available;

    public FoodItem(String name, String category, double price, boolean available) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.available = available;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    public double applyDiscount(double total) {
        return total;
    }
}
