package com.day03.swiftcart;
public class Product {
    protected String name;
    protected double price;
    protected String category;

    Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    double getDiscount() {
        return 0;
    }

    double getPrice() {
        return price;
    }
}
