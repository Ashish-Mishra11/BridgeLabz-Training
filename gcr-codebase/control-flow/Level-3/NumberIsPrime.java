// Writing a Java program to check whether a number is prime or not
// Create NumberIsPrime class to perform prime number check

import java.util.Scanner;
public class NumberIsPrime{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Input and declaration section: Create variable number to store value given by user
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    boolean isPrime = true;

    // Logic section: Check for the prime number
    if (number <= 1) {
      isPrime = false;
    } else {
      // using for loop for prime number check 
      for (int i = 2; i < number; i++) {
        if (number % i == 0) {
          isPrime = false;
          break; 
        }
      }
    }

    // Display section: Display result
    if (isPrime) {
      System.out.println(number + " is a Prime Number.");
    } else {
      System.out.println(number + " is NOT a Prime Number.");
    }

    sc.close();
  }
}
