package com.day03.swiftcart;
public class Cart implements ICheckout {

    private Product[] products;
    private int[] quantities;
    private int count;
    private double totalPrice;

    Cart() {
        products = new Product[20];
        quantities = new int[20];
        count = 0;
        totalPrice = 0;
    }

    void addProduct(Product product, int quantity) {
        products[count] = product;
        quantities[count] = quantity;
        count++;
        calculateTotal();
    }

    private void calculateTotal() {
        totalPrice = 0;
        for (int i = 0; i < count; i++) {
            totalPrice = totalPrice + (products[i].getPrice() * quantities[i]);
        }
    }

    public void applyDiscount() {
        double discount = 0;
        for (int i = 0; i < count; i++) {
            discount = discount + (products[i].getDiscount() * quantities[i]);
        }
        totalPrice = totalPrice - discount;
    }

    public void generateBill() {
        System.out.println("\nFinal Bill");
        for (int i = 0; i < count; i++) {
            System.out.println(
                products[i].name +
                " Price: " + products[i].getPrice() +
                " Quantity: " + quantities[i]
            );
        }
        System.out.println("Total Amount: " + totalPrice);
    }
}
