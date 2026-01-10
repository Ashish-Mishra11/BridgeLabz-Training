package com.day07.foodloop;

import java.util.Scanner;

public class FoodLoopDriver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Order order = new Order();

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter item type Veg or NonVeg: ");
            String type = sc.next();

            System.out.print("Enter item name: ");
            String name = sc.next();

            System.out.print("Enter price: ");
            double price = sc.nextDouble();

            System.out.print("Is item available true or false: ");
            boolean available = sc.nextBoolean();

            FoodItem item;
            if (type.equalsIgnoreCase("Veg")) {
                item = new VegItem(name, price, available);
            } else {
                item = new NonVegItem(name, price, available);
            }

            order.addItem(item);
        }

        System.out.print("Enter 1 to place order or 2 to cancel order: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            order.placeOrder();
        } else {
            order.cancelOrder();
        }

        sc.close();
    }
}
