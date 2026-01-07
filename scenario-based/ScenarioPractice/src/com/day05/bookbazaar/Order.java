package com.day05.bookbazaar;
public class Order {
    private String userName;
    private Book book;
    private int quantity;
    private String status;

    public Order(String userName, Book book, int quantity) {
        this.userName = userName;
        this.book = book;
        this.quantity = quantity;
        this.status = "CREATED";
    }

    public double calculateTotal() {
        return book.applyDiscount(quantity);
    }

    public void placeOrder() {
        book.reduceStock(quantity);
        status = "PLACED";
    }

    public void showOrderDetails() {
        System.out.println("User Name: " + userName);
        System.out.println("Book Title: " + book.getTitle());
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + calculateTotal());
        System.out.println("Order Status: " + status);
    }
}
