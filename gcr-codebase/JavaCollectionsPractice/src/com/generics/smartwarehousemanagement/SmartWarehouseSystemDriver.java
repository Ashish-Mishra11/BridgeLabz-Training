package com.generics.smartwarehousemanagement;

import java.util.List;

public class SmartWarehouseSystemDriver {
    public static void displayItems(List<? extends WarehouseItem> itemList) {
        for (WarehouseItem item : itemList) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Smartphone"));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Apples"));
        groceriesStorage.addItem(new Groceries("Bread"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair"));
        furnitureStorage.addItem(new Furniture("Table"));

        System.out.println("Electronics:");
        displayItems(electronicsStorage.getAllItems());

        System.out.println("\nGroceries:");
        displayItems(groceriesStorage.getAllItems());

        System.out.println("\nFurniture:");
        displayItems(furnitureStorage.getAllItems());
    }
}