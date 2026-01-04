package com.linkedlists.doubly.librarymanagementsystem;
public class BookNode {
    String title;
    String author;
    String genre;
    int bookId;
    boolean available;

    BookNode next;
    BookNode prev;

    public BookNode(int bookId, String title, String author, String genre, boolean available) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = available;
        this.next = null;
        this.prev = null;
    }
}
