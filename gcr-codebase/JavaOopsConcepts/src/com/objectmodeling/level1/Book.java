package com.objectmodeling.level1;

public class Book {
	String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayBook() {
        System.out.println(title + " by " + author);
    }

}
