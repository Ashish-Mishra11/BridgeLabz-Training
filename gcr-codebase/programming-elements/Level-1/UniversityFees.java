// Writing a java code to compute the discounted amount and discounted price
// Create UniversityFees class to calculate the discounted amount and discounted price
public class UniversityFees
{
  public static void main(String [] args)
  {
    // Create a variable fee to store the fees of university 
    int fee = 125000;
    
    // Create a variable discountPercent to store the discount percent
    int discountPercent = 10;
 
    // Create a variable discount to store the discount value provided by university 
    double discount = fee*10/100;

    // Create a variable pay to store the fees to be paid by the students
    double pay = fee - discount;
  
    // Display the discounted amount and discounted price
    System.out.println("The discount amount is INR "+ discount+ " and final discounted fee is INR " + pay);

  }
}