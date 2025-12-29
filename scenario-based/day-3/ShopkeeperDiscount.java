/* 8. Shopkeeper’s Discount Dashboard 🛍️
   A shopkeeper gives discounts based on total bill:
   ● Input item prices in a for-loop.
   ● Use if-else for discount logic.
   ● Use proper indentation, constants, and comments.
*/

import java.util.Scanner;

public class ShopkeeperDiscount {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String[] clothesTypes = { "T-Shirt", "Jeans", "Sweater", "Jacket" };
    int[] prices = { 200, 500, 450, 850 };
    int[] quantities = new int[prices.length];

    System.out.println("\t---Welcome to Store---\t");
    System.out.println("\n\t\t ---MENU--- ");
    System.out.println("-------------------------------------");
    System.out.println("Input Number to choose item's quantity (0 to exit): ");

    for (int i = 0; i < prices.length; i++) {
      System.out.println((i + 1) + " -- " + clothesTypes[i]);
    }

    int grandTotal = 0;

    while (true) {
      System.out.print("Enter number to pick quantity of that item : ");
      int input = sc.nextInt();

      if (input == 0) {
        break;
      }

      switch (input) {
        case 1 -> {
          System.out.print("Enter the quantity for " + clothesTypes[0] + " - ");
          int quantity = sc.nextInt();
          quantities[0] += quantity;
          grandTotal += prices[0] * quantity;
        }

        case 2 -> {
          System.out.print("Enter the quantity for " + clothesTypes[1] + " - ");
          int quantity = sc.nextInt();
          quantities[1] += quantity;
          grandTotal += prices[1] * quantity;
        }

        case 3 -> {
          System.out.print("Enter the quantity for " + clothesTypes[2] + " - ");
          int quantity = sc.nextInt();
          quantities[2] += quantity;
          grandTotal += prices[2] * quantity;
        }

        case 4 -> {
          System.out.print("Enter the quantity for " + clothesTypes[3] + " - ");
          int quantity = sc.nextInt();
          quantities[3] += quantity;
          grandTotal += prices[3] * quantity;
        }
      }
    }

    System.out.println("\n\n================== Billing ====================\n");
    System.out.printf("%-10s %-10s %-10s %-10s%n", "Types", "Prices", "Quantity", "Item Total");

    for (int i = 0; i < prices.length; i++) {
      if (quantities[i] != 0) {
        System.out.printf(
          "%-10s %-10d %-10d %-10d%n",
          clothesTypes[i],
          prices[i],
          quantities[i],
          prices[i] * quantities[i]
        );
      }
    }

    System.out.print("\nYour grand total is : " + grandTotal);

    if (grandTotal >= 2000) {
      System.out.print("\nYour grand total after discount : " + (grandTotal * 0.7));
    }else if (grandTotal >= 1500) {
      System.out.print("\nYour grand total after discount : " + (grandTotal * 0.8));
    } else if (grandTotal >= 1000) {
      System.out.print("\nYour grand total after discount : " + (grandTotal * 0.9));
    }

    sc.close();
  }
}
