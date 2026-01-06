package com.day03.swiftcart;
public class PerishableProduct extends Product {

    PerishableProduct(String name, double price, String category) {
        super(name, price, category);
    }

    double getDiscount() {
        return price * 0.10;
    }
}
