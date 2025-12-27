package com.constructors.level1;

class BookV2 {

    // Access modifiers
    public String ISBN;
    protected String title;
    private String author;

    // Constructor
    BookV2(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Setter for private author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter for private author
    public String getAuthor() {
        return author;
    }
}
