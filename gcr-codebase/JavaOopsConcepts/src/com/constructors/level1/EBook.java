package com.constructors.level1;

class EBook extends BookV2 {

    String format;

    EBook(String ISBN, String title, String author, String format) {
        super(ISBN, title, author);
        this.format = format;
    }

    void displayDetails() {
        // public member
        System.out.println("ISBN   : " + ISBN);

        // protected member
        System.out.println("Title  : " + title);

        // private member accessed via public method
        System.out.println("Author : " + getAuthor());

        System.out.println("Format : " + format);
    }

    public static void main(String[] args) {

        EBook eb = new EBook(
                "978-0135166307",
                "Java Complete Reference",
                "Herbert Schildt",
                "PDF"
        );

        eb.displayDetails();

        eb.setAuthor("H. Schildt");
        System.out.println("Updated Author: " + eb.getAuthor());
    }
}

