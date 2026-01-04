package com.linkedlists.singly.inventorymanagementsystem;
import java.util.Scanner;

public class InventoryManagementApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        InventoryLinkedList inventory = new InventoryLinkedList();
        int choice;

        do {
            System.out.println("\n--- Inventory Management System ---");
            System.out.println("1. Add Item at Beginning");
            System.out.println("2. Add Item at End");
            System.out.println("3. Add Item at Position");
            System.out.println("4. Remove Item by ID");
            System.out.println("5. Update Quantity");
            System.out.println("6. Search by ID");
            System.out.println("7. Search by Name");
            System.out.println("8. Total Inventory Value");
            System.out.println("9. Sort by Name");
            System.out.println("10. Sort by Price");
            System.out.println("11. Display All Items");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                case 2:
                case 3:
                    System.out.print("Item ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Item Name: ");
                    String name = sc.nextLine();
                    System.out.print("Quantity: ");
                    int qty = sc.nextInt();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();

                    if (choice == 1)
                        inventory.addAtBeginning(id, name, qty, price);
                    else if (choice == 2)
                        inventory.addAtEnd(id, name, qty, price);
                    else {
                        System.out.print("Position: ");
                        int pos = sc.nextInt();
                        inventory.addAtPosition(pos, id, name, qty, price);
                    }
                    break;

                case 4:
                    System.out.print("Enter Item ID: ");
                    inventory.removeById(sc.nextInt());
                    break;

                case 5:
                    System.out.print("Enter Item ID: ");
                    int itemId = sc.nextInt();
                    System.out.print("New Quantity: ");
                    inventory.updateQuantity(itemId, sc.nextInt());
                    break;

                case 6:
                    System.out.print("Enter Item ID: ");
                    inventory.searchById(sc.nextInt());
                    break;

                case 7:
                    sc.nextLine();
                    System.out.print("Enter Item Name: ");
                    inventory.searchByName(sc.nextLine());
                    break;

                case 8:
                    inventory.totalInventoryValue();
                    break;

                case 9:
                    inventory.sortByName(true);
                    break;

                case 10:
                    inventory.sortByPrice(true);
                    break;

                case 11:
                    inventory.displayAll();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 0);

        sc.close();
    }
}
