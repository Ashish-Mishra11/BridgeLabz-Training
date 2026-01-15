package com.day03.smartcheckout;
import java.util.*;

class CheckoutCounter {

    Queue<Customer> queue = new LinkedList<>();
    ItemStore store;

    CheckoutCounter(ItemStore store) {
        this.store = store;
    }

    void addCustomer(Customer c) {
        queue.add(c);
    }

    void processCustomers() {

        while (!queue.isEmpty()) {
            Customer c = queue.poll();
            int total = 0;

            System.out.println("Billing customer " + c.name);

            for (String item : c.items) {
                if (store.isAvailable(item)) {
                    total += store.getPrice(item);
                    store.updateStock(item);
                } else {
                    System.out.println(item + " not available");
                }
            }

            System.out.println("Total bill " + total);
            System.out.println("-----");
        }
    }
}
