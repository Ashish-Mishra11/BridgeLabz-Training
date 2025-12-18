// Writing a java code to find the sum of numbers until the user enters 0
// Create SumOfNumbers class to find the sum of numbers until the user enters 0

import java.util.Scanner;
public class SumOfNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
    // Input section: Create variable total to store the total answer and intialize it with 0.0
    double total = 0.0;

    // Logic section: Calculate the sum of given numbers using while loop
    System.out.println("Enter continuously the number for addition");
    while(true) {
      System.out.print("Enter the number: ");
      double userInput = sc.nextDouble();// Create userInput variable to store the value given by user
      if(userInput == 0) {
        break;
      }
      total += userInput;// Calculating the total value
    }
 
    // Display section: Display the total value
    System.out.println("The total value is: " + total);

    sc.close();
  }
}