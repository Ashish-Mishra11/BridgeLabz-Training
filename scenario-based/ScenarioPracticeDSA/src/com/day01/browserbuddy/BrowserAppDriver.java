package com.day01.browserbuddy;
import java.util.Scanner;

class BrowserAppDriver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BrowserTab tab = new BrowserTab("home");
        TabManager manager = new TabManager();

        while (true) {

            System.out.println("1 Visit Page");
            System.out.println("2 Back");
            System.out.println("3 Forward");
            System.out.println("4 Close Tab");
            System.out.println("5 Reopen Tab");
            System.out.println("6 Current Page");
            System.out.println("7 Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.println("Enter url");
                String url = sc.nextLine();
                tab.visit(url);
            }

            else if (choice == 2) {
                tab.back();
            }

            else if (choice == 3) {
                tab.forward();
            }

            else if (choice == 4) {
                manager.closeTab(tab);
                System.out.println("Opening new home tab");
                tab = new BrowserTab("home");
            }

            else if (choice == 5) {
                BrowserTab restored = manager.reopenTab();
                if (restored != null) {
                    tab = restored;
                }
            }

            else if (choice == 6) {
                System.out.println("Current page is " + tab.getCurrentPage());
            }

            else if (choice == 7) {
                System.out.println("Goodbye");
                break;
            }

            else {
                System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}
