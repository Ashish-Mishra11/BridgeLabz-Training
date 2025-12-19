// Writing a java code to print Fizz and Buzz at every number arrival
// Create FizzAndBuzz class to print the FizzBuzz pattern accordingly

import java.util.Scanner;
public class FizzAndBuzz {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section: Create a variable number to store a value given by user 
    System.out.print("Enter a number: ");
    int number = sc.nextInt();

    // Logic section: Check for a positive integer and use for loop to display FizzBuzz
    if (number > 0) {
      for (int i = 1; i <= number; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
          System.out.println("FizzBuzz");// Display FizzBuzz message
        } else if (i % 3 == 0) {
          System.out.println("Fizz");// Display Fizz message
        } else if (i % 5 == 0) {
          System.out.println("Buzz");// Display Buzz message
        } else {
          System.out.println(i);// Display number only
        }
      }
    } else {
      System.out.println("Please enter a positive integer.");// Display a message
    }

    sc.close();
  }
}