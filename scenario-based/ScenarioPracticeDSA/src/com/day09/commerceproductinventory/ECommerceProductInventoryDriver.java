package com.day09.commerceproductinventory;

class ECommerceProductInventoryDriver {
	
    public static void main(String[] args) {
        ProductBST store = new ProductBST();

        
        store.addOrUpdate(new Product("P001", "iPhone 17", 79999, 10));
        store.addOrUpdate(new Product("P005", "earbuds", 1499, 50));
        store.addOrUpdate(new Product("P002", "EarPods", 4999, 30));
        store.addOrUpdate(new Product("P010", "desktop", 65000, 5));
        store.addOrUpdate(new Product("P003", "keyboard", 899, 100));

        
        System.out.println("All products:");
        store.printSorted();

        
        System.out.println("\nFind P002:");
        Product item = store.find("P002");
        System.out.println(item != null ? item : "Not found");

        
        System.out.println("\nUpdating P005...");
        store.addOrUpdate(new Product("P005", "Charger", 1299, 45));

        
        System.out.println("\nAfter update:");
        store.printSorted();
    }
}