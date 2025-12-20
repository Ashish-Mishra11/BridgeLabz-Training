// Create CountDigitFrequency class to find frequency of each digit in a number given by user

import java.util.Scanner;
public class CountDigitFrequency {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section: Create number variable to store the values given by user
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    int tempNumber = number;
    int count = 0;

    // Logic section: Find count of digits
    while (tempNumber != 0) {
      count++;
      tempNumber = tempNumber / 10;
    }

    // Declaration section: Create array to store digits of number
    int[] digits = new int[count];

    // Logic section: Store digits in array of the number
    tempNumber = number;
    int index = 0;
    while (tempNumber != 0) {
      digits[index] = tempNumber % 10;
      tempNumber = tempNumber / 10;
      index++;
    }

    // Declaration section: Frequency array for digits 0 to 9
    int[] frequency = new int[10];

    // Logic section: Find frequency of each digit
    for (int i = 0; i < count; i++) {
      frequency[digits[i]]++;
    }

    // Display section: Display frequency of each digit of the number
    System.out.println("\nDigit Frequency:");
    for (int i = 0; i < 10; i++) {
      if (frequency[i] > 0) {
        System.out.println("Digit " + i + " occurs " + frequency[i] + " time");
      }
    }

    sc.close();
  }
}
