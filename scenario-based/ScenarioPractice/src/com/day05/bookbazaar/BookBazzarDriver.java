package com.day05.bookbazaar;
import java.util.Scanner;

public class BookBazzarDriver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter user name");
        String userName = sc.nextLine();

        System.out.println("Select book type");
        System.out.println("1 EBook");
        System.out.println("2 PrintedBook");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter book title");
        String title = sc.nextLine();

        System.out.println("Enter author name");
        String author = sc.nextLine();

        System.out.println("Enter price");
        double price = sc.nextDouble();

        System.out.println("Enter stock");
        int stock = sc.nextInt();

        System.out.println("Enter quantity to order");
        int quantity = sc.nextInt();

        Book book;

        if (choice == 1) {
            book = new EBook(title, author, price, stock);
        } else {
            book = new PrintedBook(title, author, price, stock);
        }

        Order order = new Order(userName, book, quantity);
        order.placeOrder();
        order.showOrderDetails();

        sc.close();
    }
}
