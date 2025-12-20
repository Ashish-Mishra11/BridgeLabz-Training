// Create ReverseNumberArray class to reverse a number given by users using arrays

import java.util.Scanner;
public class ReverseNumberArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section: Create variable number to take user input
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    int tempNumber = number;
    int count = 0;

    // Logic section: Count digits of the number
    while (tempNumber != 0) {
      count++;
      tempNumber = tempNumber / 10;
    }

    // Declaration section: To declare the array used in problem
    int[] digits = new int[count];
    int[] reverseDigits = new int[count];

    // Logic section: Store digits in corrrect order
    tempNumber = number;
    for (int i = count - 1; i >= 0; i--) {
      digits[i] = tempNumber % 10;
      tempNumber = tempNumber / 10;
    }

    // Logic section: Reverse the digits of number in array
    for (int i = 0; i < count; i++) {
      reverseDigits[i] = digits[count - 1 - i];
    }

    // Display section: Display the results
    System.out.print("Reversed number: ");
    for (int i = 0; i < count; i++) {
      System.out.print(reverseDigits[i]);
    }

    sc.close();
  }
}
