// Writing a java code to print Fizz and Buzz at every number arrival
// Create FizzAndBuzzV2 class to print the FizzBuzz pattern accordingly

import java.util.Scanner;
public class FizzAndBuzzV2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section: Create a variable number to store a value given by user 
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    int i = 1;

    // Logic section: Check for a positive integer and use while loop to display FizzBuzz
    if (number > 0) {
      while(i <= number) {
        if (i % 3 == 0 && i % 5 == 0) {
          System.out.println("FizzBuzz");// Display FizzBuzz message
        } else if (i % 3 == 0) {
          System.out.println("Fizz");// Display Fizz message
        } else if (i % 5 == 0) {
          System.out.println("Buzz");// Display Buzz message
        } else {
          System.out.println(i);// Display number only
        }
        i++;
      }
    } else {
      System.out.println("Please enter a positive integer.");// Display a message
    }

    sc.close();
  }
}