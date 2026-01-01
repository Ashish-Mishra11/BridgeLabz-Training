package com.encapsulation.onlinefooddeliverysystem;

public class VegItem extends FoodItem implements Discountable {
	VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getBaseTotal() - applyDiscount();
    }

    @Override
    public double applyDiscount() {
        return getBaseTotal() * 0.10;
    }

    @Override
    public String getDiscountDetails() {
        return "10% discount on veg items";
    }

}
