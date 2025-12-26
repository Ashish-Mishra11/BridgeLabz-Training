import java.util.Scanner;
public class CoffeeCounterChronicles {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String coffeeType;

    // while loop for continuous customers
    while (true) {

      // Input section: take the user inputs
      System.out.println("\nEnter coffee type (Espresso / Latte / Cappuccino) or type 'exit' to stop:");
      coffeeType = sc.nextLine();

      // exit condition
      if (coffeeType.trim().equalsIgnoreCase("exit")) {
        System.out.println("Cafe closed. Thank you! ☕");
        break;
      }

      System.out.println("Enter quantity:");
      int quantity = sc.nextInt();
      sc.nextLine();

      double price = 0;

      // switch to decide coffee price
      switch (coffeeType.toLowerCase()) {
        case "espresso":
          price = 100;
          break;

        case "latte":
          price = 120;
          break;

        case "cappuccino":
          price = 150;
          break;

        default:
          System.out.println("Invalid coffee type!");
          continue;
      }

      // bill calculation
      double total = price * quantity;
      double gst = total * 0.05; // 5% GST
      double finalBill = total + gst;

      // Display the results
      System.out.println("Total Bill (without GST): " + total);
      System.out.println("GST (5%): " + gst);
      System.out.println("Final Bill: " + finalBill);
    }

    sc.close();
  }
}
