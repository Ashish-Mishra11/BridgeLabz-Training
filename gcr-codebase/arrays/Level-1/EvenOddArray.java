// Create EvenOddArray class to save and display odd and even numbers

import java.util.Scanner;
public class EvenOddArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section: Create variable number and array oddNumbers and evenNumbers to store user input
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    int[] oddNumbers = new int[number / 2 + 1];
    int[] evenNumbers = new int[number / 2 + 1];
      // Create index variable to store indexes
    int oddIndex = 0; 
    int evenIndex = 0;

    // Logic section: Check for natural number and distribute even to even array and similar to odd
    if (number <= 0) {
      System.err.println("Error: Please enter a natural number.");
      sc.close();
      System.exit(1); // Exit program due to error
    }
    for (int i = 1; i <= number; i++) {
      if (i % 2 == 0) {
        evenNumbers[evenIndex++] = i;
      } else {
        oddNumbers[oddIndex++] = i;
      }
    }

    // Display section: Display odd numbers and Display even numbers
    System.out.println("Odd Numbers:");
    for (int i = 0; i < oddIndex; i++) {
      System.out.print(oddNumbers[i] + " ");
    } 
    System.out.println("\nEven Numbers:");
    for (int i = 0; i < evenIndex; i++) {
      System.out.print(evenNumbers[i] + " ");
    }

    sc.close();
  }
}
