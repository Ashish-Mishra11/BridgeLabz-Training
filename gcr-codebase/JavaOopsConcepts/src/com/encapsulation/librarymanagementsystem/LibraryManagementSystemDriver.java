package com.encapsulation.librarymanagementsystem;
import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystemDriver {
	public static void main(String[] args) {

        List<LibraryItem> items = new ArrayList<>();

        LibraryItem b1 = new Book(1, "Effective Java", "Joshua Bloch");
        LibraryItem m1 = new Magazine(2, "Tech Monthly", "Editorial Team");
        LibraryItem d1 = new DVD(3, "Inception", "Christopher Nolan");

        items.add(b1);
        items.add(m1);
        items.add(d1);

        ((Reservable) b1).reserveItem("Anita");

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration (days): " + item.getLoanDuration());
            System.out.println();
        }
    }

}
