// Writing a java code to find the sum of n natural numbers using for loop
// Create NaturalNumberSumV2 class to find the sum of n natural numbers using for loop

import java.util.Scanner;
public class NaturalNumberSumV2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
    // Input and declaration section: Create variable number to store the number given by user
    System.out.print("Enter the number: ");
    int number = sc.nextInt();
    int total1 = 0;
    int total2 = 0;

    // Logic section: First check whether the number is natural number or not and then find the sum of n natural numbers
    if(number > 0) {
      // Find the sum of n natural number using formula, making variable total1 to store the results 
      total1 = number * (number + 1) / 2;
      // Find the sum of n natural number using for loop
      for( ; number > 0; number--) {
        // Create variable total2 to store the total value calculated through for loop
        total2 +=number;
      }
    }
    else {
      System.out.println("The given number is not a natural number");
    }
    
 
    // Display section: Display the result
    System.out.println("The total through formula is " + total1 + " and the total through for loop is " + total2 + "\nHence the total of natural number is " + total1 );

    sc.close();
  }
}