package com.day05.bookbazaar;
public class EBook extends Book implements IDiscountable {

    public EBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    @Override
    public double applyDiscount(int quantity) {
        double total = price * quantity;
        return total - (total * 0.20);
    }
}
