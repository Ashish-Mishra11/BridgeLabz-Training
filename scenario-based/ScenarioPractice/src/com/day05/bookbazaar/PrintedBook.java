package com.day05.bookbazaar;
public class PrintedBook extends Book implements IDiscountable {

    public PrintedBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    @Override
    public double applyDiscount(int quantity) {
        double total = price * quantity;
        return total - (total * 0.10);
    }
}
