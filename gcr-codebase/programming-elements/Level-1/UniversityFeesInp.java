// Writing a java code to compute the discounted amount and discounted price
// Create UniversityFeesInp class to calculate the discounted amount and discounted price
import java.util.Scanner;
public class UniversityFeesInp
{
  public static void main(String [] args)
  {
    // Create the Scanner object to take the input from user
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter the university fees: ");

    // Create a variable fee to store the fees of university 
    int fee = sc.nextInt();

    System.out.print("Enter the discount provided: ");
    
    // Create a variable discountPercent to store the discount percent
    int discountPercent = sc.nextInt();
 
    // Create a variable discount to store the discount value provided by university 
    double discount = fee*10/100;

    // Create a variable pay to store the fees to be paid by the students
    double pay = fee - discount;
  
    // Display the discounted amount and discounted price
    System.out.println("The discount amount is INR "+ discount+ " and final discounted fee is INR " + pay);
    
    //close the Scanner object 
    sc.close();
  }
}