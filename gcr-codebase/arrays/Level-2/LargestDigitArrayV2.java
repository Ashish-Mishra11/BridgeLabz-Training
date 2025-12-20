// Create LargestDigitArrayV2 class to find largest and second largest digit of given number

import java.util.Scanner;
public class LargestDigitArrayV2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input and declaration section: Take the input values and declare variables 
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    int maxDigit = 10;                 
    int[] digits = new int[maxDigit];
    int index = 0;                    

    // Logic section: Logic to make array dynamic to store more value and find largest and second largest digits
    while (number != 0) {
      if (index == maxDigit) {
        maxDigit = maxDigit + 10;
        int[] temp = new int[maxDigit];
        // Copy existing digits into temp array
        for (int i = 0; i < digits.length; i++) {
          temp[i] = digits[i];
        }
        digits = temp; // Assign expanded array back
      }

      digits[index] = number % 10;     
      number = number / 10;            
      index++;
    }
      // Logic section: Find largest and second largest digit
    int largest = 0;
    int secondLargest = 0;

    for (int i = 0; i < index; i++) {
      if (digits[i] > largest) {
        secondLargest = largest;
        largest = digits[i];
      } else if (digits[i] > secondLargest && digits[i] != largest) {
        secondLargest = digits[i];
      }
    }

    // Display section: Display the results
    System.out.println("Largest digit: " + largest);
    System.out.println("Second largest digit: " + secondLargest);

    sc.close();
  }
}
