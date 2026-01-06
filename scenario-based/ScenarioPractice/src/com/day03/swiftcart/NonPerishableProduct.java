package com.day03.swiftcart;
public class NonPerishableProduct extends Product {

    NonPerishableProduct(String name, double price, String category) {
        super(name, price, category);
    }

    double getDiscount() {
        return price * 0.05;
    }
}
