// Create LargestDigitArray class to find largest and second largest digit of a number 

import java.util.Scanner;
public class LargestDigitArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input and declaration section
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    int maxDigit = 10;                
    int[] digits = new int[maxDigit];
    int index = 0;    
    int largest = 0;
    int secondLargest = 0;               

    // Logic section: Store digits of the number in array
      // Logic section: Find largest and second largest digit
    while (number != 0) {
      if (index == maxDigit) {
        break; // Stop if array size limit is reached
      }
      digits[index] = number % 10;   
      number = number / 10;           
      index++;
    }
    for (int i = 0; i < index; i++) {
      if (digits[i] > largest) {
        secondLargest = largest;
        largest = digits[i];
      } else if (digits[i] > secondLargest && digits[i] != largest) {
        secondLargest = digits[i];
      }
    }

    // Display section: Display the result
    System.out.println("Largest digit: " + largest);
    System.out.println("Second largest digit: " + secondLargest);

    sc.close();
  }
}
