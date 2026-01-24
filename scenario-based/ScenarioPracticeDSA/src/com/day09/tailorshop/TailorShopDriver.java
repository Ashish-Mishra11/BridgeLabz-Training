package com.day09.tailorshop;
public class TailorShopDriver {
    public static void main(String[] args) {

        Order[] orders = new Order[5];
        orders[0] = new Order(101, 5);
        orders[1] = new Order(102, 2);
        orders[2] = new Order(103, 8);
        orders[3] = new Order(104, 1);
        orders[4] = new Order(105, 4);

        TailorShop shop = new TailorShop();

        System.out.println("Before Sorting");
        shop.displayOrders(orders);

        shop.insertionSort(orders);

        System.out.println("After Sorting by Deadline");
        shop.displayOrders(orders);
    }
}
