// Writing a java code to calculate the total price
// Create TotalPrice class to compute the total price of the items bought
import java.util.Scanner;
public class TotalPrice
{
  public static void main(String[] args)
  {
    // Input section: Create variables unitPrice and quantity to take input of unit price and quantity
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the unit price of item: ");
    double unitPrice = sc.nextDouble();
    System.out.print("Enter the quantity bought: ");
    double quantity = sc.nextDouble();
    
    // Logic section: Calculation of total price of items bought
    double totalPrice = unitPrice * quantity;
    
    // Display section: Display the results
    System.out.println("The total purchase price is INR " + totalPrice +
                       " if the quantity " + quantity + 
                       " and unit price is INR " + unitPrice);
    sc.close();
  }
}