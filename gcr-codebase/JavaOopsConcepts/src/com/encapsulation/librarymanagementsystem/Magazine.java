package com.encapsulation.librarymanagementsystem;

public class Magazine extends LibraryItem implements Reservable {
	Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable()) {
            setBorrowerName(borrowerName);
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }

}
