package com.encapsulation.librarymanagementsystem;

public class Book extends LibraryItem implements Reservable {
	 Book(int itemId, String title, String author) {
	        super(itemId, title, author);
	    }

	    @Override
	    public int getLoanDuration() {
	        return 14;
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
