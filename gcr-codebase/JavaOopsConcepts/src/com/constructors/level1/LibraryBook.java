package com.constructors.level1;

class LibraryBook {

    String title;
    String author;
    double price;
    boolean availability;

    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = true; // by default book available
    }

    void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("Sorry, book is already borrowed.");
        }
    }

    // Method to display book details
    void displayBookDetails() {
        System.out.println("Title        : " + title);
        System.out.println("Author       : " + author);
        System.out.println("Price        : ₹" + price);
        System.out.println("Available    : " + availability);
    }


    public static void main(String[] args) {

        LibraryBook b1 = new LibraryBook("Java Programming", "James Gosling", 599);

        b1.displayBookDetails();

        // Borrow book first time
        b1.borrowBook();

        // Try borrowing again
        b1.borrowBook();

        b1.displayBookDetails();
    }
}

