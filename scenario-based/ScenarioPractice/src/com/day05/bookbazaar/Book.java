package com.day05.bookbazaar;
public class Book {
    private String title;
    private String author;
    protected double price;
    private int stock;

    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void reduceStock(int quantity) {
        if (quantity <= stock) {
            stock = stock - quantity;
        } else {
            System.out.println("Insufficient stock");
        }
    }

    public double applyDiscount(int quantity) {
        return price * quantity;
    }
}
