// Writing a Java program to check whether a number is a Harshad Number or not 
// Create CheckHarshadNumber class to perform Harshad number check on program 

import java.util.Scanner;
public class CheckHarshadNumber {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

     // Input and declaration section: Create variable number to store value given by user
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    int sum = 0;// Declare variable sum and assign 0 to it
    int originalNumber = number;// Declare variable originalNumber and assign number to it

    // Loop section: Check whether a number is harshad number or not
    while (originalNumber != 0) {
      int digit = originalNumber % 10;
      sum = sum + digit;
      originalNumber = originalNumber / 10;
    }

    // Display results 
    if (sum != 0 && number % sum == 0) {
      System.out.println(number + " is a Harshad Number.");
    } else {
      System.out.println(number + " is NOT a Harshad Number.");
    }

    sc.close();
  }
}
