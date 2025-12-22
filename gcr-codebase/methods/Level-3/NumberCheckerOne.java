import java.util.Scanner;
public class NumberCheckerOne {

  // Method section: create the necessary methods
  // Method to find count of digits
  public static int countDigits(int number) {
    int count = 0;
    while (number != 0) {
      count++;
      number = number / 10;
    }
    return count;
  }
  // Method to store digits in an array
  public static int[] storeDigits(int number) {
    int count = countDigits(number);
    int[] digits = new int[count];
    int index = 0;

    while (number != 0) {
      digits[index] = number % 10;
      number = number / 10;
      index++;
    }
    return digits;
  }
  // Method to check Duck Number
  public static boolean isDuckNumber(int[] digits) {
    for (int i = 0; i < digits.length; i++) {
      if (digits[i] != 0) {
        return true;
      }
    }
    return false;
  }
  // Method to check Armstrong Number
  public static boolean isArmstrong(int number, int[] digits) {
    int sum = 0;
    int power = digits.length;

    for (int i = 0; i < digits.length; i++) {
      sum = sum + (int)Math.pow(digits[i], power);
    }
    return sum == number;
  }
  // Method to find largest and second largest digit
  public static void findLargestAndSecondLargest(int[] digits) {
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;
    for (int i = 0; i < digits.length; i++) {
      if (digits[i] > largest) {
        secondLargest = largest;
        largest = digits[i];
      } else if (digits[i] > secondLargest && digits[i] != largest) {
        secondLargest = digits[i];
      }
    }
    System.out.println("Largest digit: " + largest);
    System.out.println("Second Largest digit: " + secondLargest);
  }
  // Method to find smallest and second smallest digit
  public static void findSmallestAndSecondSmallest(int[] digits) {
    int smallest = Integer.MAX_VALUE;
    int secondSmallest = Integer.MAX_VALUE;
    for (int i = 0; i < digits.length; i++) {
      if (digits[i] < smallest) {
        secondSmallest = smallest;
        smallest = digits[i];
      } else if (digits[i] < secondSmallest && digits[i] != smallest) {
        secondSmallest = digits[i];
      }
    }
    System.out.println("Smallest digit: " + smallest);
    System.out.println("Second Smallest digit: " + secondSmallest);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 
    // Input section: Take the input from user
    System.out.print("Enter a number: ");
    int number = sc.nextInt();

    int[] digits = storeDigits(number);

    System.out.println("Count of digits: " + countDigits(number));

    // Display section: Display the results
    System.out.print("Digits stored in array: ");
    for (int i = 0; i < digits.length; i++) {
      System.out.print(digits[i] + " ");
    }
    System.out.println();

    if (isDuckNumber(digits)) {
      System.out.println("It is a Duck Number");
    } else {
      System.out.println("It is NOT a Duck Number");
    }

    if (isArmstrong(number, digits)) {
      System.out.println("It is an Armstrong Number");
    } else {
      System.out.println("It is NOT an Armstrong Number");
    }

    findLargestAndSecondLargest(digits);
    findSmallestAndSecondSmallest(digits);

    sc.close();
  }
}
