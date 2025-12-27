package com.constructors.level1;

public class Book {

    String title;
    String author;
    double price;

    Book() {
        title = "The song of fire and ice";
        author = "George R Martin";
        price = 1500;
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Display section: display book details
    void displayBookDetails() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
    }
    
    public static void main(String[] args) {

        // Object Creation and method calling: Create the book object
        Book b1 = new Book();
        b1.displayBookDetails();

        System.out.println();

        Book b2 = new Book("Java Programming", "James Gosling", 600);
        b2.displayBookDetails();
    } 
}

