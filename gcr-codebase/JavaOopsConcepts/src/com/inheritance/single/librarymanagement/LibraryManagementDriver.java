package com.inheritance.single.librarymanagement;

public class LibraryManagementDriver {
	public static void main(String[] args) {
        Author book1 = new Author(
            "Effective Java",
            2018,
            "Joshua Bloch",
            "Java expert and software engineer"
        );
        book1.displayInfo();
    }

}
