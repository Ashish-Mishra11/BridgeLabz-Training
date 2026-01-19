package com.generics.dynamiconlinemarketplace;

public class OnlineMarketplaceDriver {
    public static void main(String[] args) {
        Product<BookProduct> book = new Product<>("B001", 
            new BookProduct("Java Guide", 567.0, "Science"));
            
        Product<ClothingProduct> shirt = new Product<>("C001", 
            new ClothingProduct("Casual Shirt", 1200.0, "Shirt"));
            
        Product<GadgetProduct> phone = new Product<>("G001", 
            new GadgetProduct("Galaxy S23", 80000.0, "Phone"));
            
        Marketplace.applyDiscount(book, 20);
        Marketplace.applyDiscount(shirt, 15);
        Marketplace.applyDiscount(phone, 10);
        
        System.out.println("Book price after discount: " + book.getItem().price);
        System.out.println("Shirt price after discount: " + shirt.getItem().price);
        System.out.println("Phone price after discount: " + phone.getItem().price);
    }
}