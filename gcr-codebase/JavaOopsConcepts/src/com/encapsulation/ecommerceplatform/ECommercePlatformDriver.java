package com.encapsulation.ecommerceplatform;
import java.util.ArrayList;
import java.util.List;

public class ECommercePlatformDriver {
	public static void printFinalPrices(List<Product> products) {
        for (Product p : products) {

            double tax = 0;

            if (p instanceof Taxable) {
                tax = ((Taxable) p).calculateTax();
            }

            double finalPrice = p.getPrice() + tax - p.calculateDiscount();

            System.out.println("Product: " + p.getName());
            System.out.println("Final Price: " + finalPrice);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Electronics(1, "Laptop", 70000));
        products.add(new Clothing(2, "Jacket", 3000));
        products.add(new Groceries(3, "Rice Bag", 1200));

        printFinalPrices(products);
    }

}
