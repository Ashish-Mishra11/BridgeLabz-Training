package com.day01.bookshelf;
import java.util.Scanner;

class LibraryAppDriver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BookShelf shelf = new BookShelf();

        while (true) {

            System.out.println("1 Add Book");
            System.out.println("2 Remove Book");
            System.out.println("3 Display Books");
            System.out.println("4 Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.println("Enter genre");
                String genre = sc.nextLine();

                System.out.println("Enter book title");
                String title = sc.nextLine();

                System.out.println("Enter author name");
                String author = sc.nextLine();

                Book book = new Book(title, author);
                shelf.addBook(genre, book);
            }

            else if (choice == 2) {
                System.out.println("Enter genre");
                String genre = sc.nextLine();

                System.out.println("Enter book title");
                String title = sc.nextLine();

                System.out.println("Enter author name");
                String author = sc.nextLine();

                Book book = new Book(title, author);
                shelf.removeBook(genre, book);
            }

            else if (choice == 3) {
                shelf.displayBooks();
            }

            else if (choice == 4) {
                System.out.println("Thank you");
                break;
            }

            else {
                System.out.println("Invalid choice");
            }
        }
        sc.close();    }
}
