package com.day03.swiftcart;
import java.util.Scanner;

public class SwiftCartDriver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cart cart = new Cart();

        System.out.println("Enter number of products");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.println("Enter product name");
            String name = sc.nextLine();

            System.out.println("Enter price");
            double price = sc.nextDouble();
            sc.nextLine();

            System.out.println("Enter category");
            String category = sc.nextLine();

            System.out.println("Enter quantity");
            int quantity = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter product type");
            System.out.println("1 Perishable");
            System.out.println("2 Non Perishable");
            int type = sc.nextInt();
            sc.nextLine();

            Product product;
            if (type == 1) {
                product = new PerishableProduct(name, price, category);
            } else {
                product = new NonPerishableProduct(name, price, category);
            }

            cart.addProduct(product, quantity);
        }

        cart.applyDiscount();
        cart.generateBill();

        sc.close();
    }
}
