package com.encapsulation.librarymanagementsystem;

public abstract class LibraryItem {
	private int itemId;
    private String title;
    private String author;
    private String borrowerName;
    private boolean available = true;

    LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    protected void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
        this.available = false;
    }

    protected void clearBorrower() {
        this.borrowerName = null;
        this.available = true;
    }

    protected boolean isAvailable() {
        return available;
    }

    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + available);
    }

    public abstract int getLoanDuration();

}
