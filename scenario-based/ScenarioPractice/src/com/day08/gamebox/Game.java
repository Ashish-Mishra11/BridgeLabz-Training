package com.day08.gamebox;
public abstract class Game implements IDownloadable {

    private String title;
    private String genre;
    protected double price;
    protected double rating;

    protected Game(String title, String genre, double price, double rating) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public void applyOffer(double discountPercent) {
        price = price - (price * discountPercent / 100);
    }
}
