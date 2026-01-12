package com.day01.bookshelf;
import java.util.*;

class BookShelf {

    HashMap<String, LinkedList<Book>> catalog;
    HashSet<Book> uniqueBooks;

    BookShelf() {
        catalog = new HashMap<>();
        uniqueBooks = new HashSet<>();
    }

    void addBook(String genre, Book book) {
        if (uniqueBooks.contains(book)) {
            System.out.println("Book already exists");
            return;
        }

        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(book);
        uniqueBooks.add(book);

        System.out.println("Book added successfully");
    }

    void removeBook(String genre, Book book) {
        if (!catalog.containsKey(genre)) {
            System.out.println("Genre not found");
            return;
        }

        LinkedList<Book> list = catalog.get(genre);
        if (list.remove(book)) {
            uniqueBooks.remove(book);
            System.out.println("Book removed successfully");
        } else {
            System.out.println("Book not found");
        }
    }

    void displayBooks() {
        if (catalog.isEmpty()) {
            System.out.println("Library is empty");
            return;
        }

        for (String genre : catalog.keySet()) {
            System.out.println("Genre " + genre);
            for (Book b : catalog.get(genre)) {
                System.out.println(b);
            }
        }
    }
}
