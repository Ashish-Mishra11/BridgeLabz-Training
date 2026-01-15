package com.day03.smartcheckout;
import java.util.*;

public class SmartCheckoutDriver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ItemStore store = new ItemStore();
        CheckoutCounter counter = new CheckoutCounter(store);

        System.out.print("Enter number of customers ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter customer name ");
            String name = sc.nextLine();

            System.out.print("Enter number of items ");
            int itemCount = sc.nextInt();
            sc.nextLine();

            List<String> items = new ArrayList<>();

            for (int j = 0; j < itemCount; j++) {
                System.out.print("Enter item name ");
                items.add(sc.nextLine());
            }

            Customer customer = new Customer(name, items);
            counter.addCustomer(customer);
        }

        counter.processCustomers();

        System.out.println("Final stock status");
        store.printStock();

        sc.close();
    }
}
