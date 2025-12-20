// Create ArrayFizzBuzz class to store FizzBuzz results in an array

import java.util.Scanner;
public class ArrayFizzBuzz {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input and declaration section: Create variable number and String array results to store the pattern of FizzBuzz
    System.out.print("Enter a positive number: ");
    int number = sc.nextInt();
    String[] results = new String[number + 1];

    // Logic section: Storing pattern based on conditions
    for (int i = 0; i <= number; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        results[i] = "FizzBuzz";
      } else if (i % 3 == 0) {
        results[i] = "Fizz";
      } else if (i % 5 == 0) {
        results[i] = "Buzz";
      } else {
        results[i] = Integer.toString(i);
      }
    }

    // Display section: Display results with position 
    for (int i = 0; i <= number; i++) {
      System.out.println("Position " + i + " = " + results[i]);
    }

    sc.close();
  }
}
