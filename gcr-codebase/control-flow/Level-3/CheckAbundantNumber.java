// Writing a Java program to check whether a number is an Abundant Number
// Create CheckAbundantNumber class to perform abundant number check

import java.util.Scanner;

public class CheckAbundantNumber {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Input and declaration section: Create variable number to store value given by user
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    int sum = 0;// Declare variable sum and assign 0 to it

    // Loop section: checking whether a number is abundant or not
    for (int i = 1; i < number; i++) {
      // Check if i is a divisor of number
      if (number % i == 0) {
        sum = sum + i; // sum all the factors
      }
    }

    // Display section: Display the results
    if (sum > number) {
      System.out.println(" an Abundant Number.");
    } else {
      System.out.println(" NOT an Abundant Number.");
    }

    sc.close();
  }
}
