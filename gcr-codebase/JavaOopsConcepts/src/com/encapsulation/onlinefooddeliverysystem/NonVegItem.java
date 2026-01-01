package com.encapsulation.onlinefooddeliverysystem;

public class NonVegItem extends FoodItem implements Discountable{
	private static final double EXTRA_CHARGE = 50;

    NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getBaseTotal() + EXTRA_CHARGE - applyDiscount();
    }

    @Override
    public double applyDiscount() {
        return getBaseTotal() * 0.05;
    }

    @Override
    public String getDiscountDetails() {
        return "5% discount on non-veg items";
    }

}
