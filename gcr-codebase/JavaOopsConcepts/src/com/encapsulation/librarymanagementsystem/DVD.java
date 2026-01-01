package com.encapsulation.librarymanagementsystem;

public class DVD extends LibraryItem implements Reservable {
	DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 5;
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
