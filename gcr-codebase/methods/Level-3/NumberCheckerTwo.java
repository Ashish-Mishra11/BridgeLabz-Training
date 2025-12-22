import java.util.Scanner;

public class NumberCheckerTwo {

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
  // Method to store digits of the number in an array
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
  // Method to find sum of digits using digits array
  public static int sumOfDigits(int[] digits) {
    int sum = 0;
    for (int i = 0; i < digits.length; i++) {
      sum = sum + digits[i];
    }
    return sum;
  }
  // Method to find sum of squares of digits using Math.pow()
  public static int sumOfSquaresOfDigits(int[] digits) {
    int sum = 0;
    for (int i = 0; i < digits.length; i++) {
      sum = sum + (int)Math.pow(digits[i], 2);
    }
    return sum;
  }
  // Method to check Harshad Number
  public static boolean isHarshadNumber(int number, int[] digits) {
    int sum = sumOfDigits(digits);
    return number % sum == 0;
  }
  // Method to find frequency of each digit
  // 2D array → digit | frequency
  public static int[][] digitFrequency(int[] digits) {
    int[][] frequency = new int[10][2];

    // Initialize digits column
    for (int i = 0; i < 10; i++) {
      frequency[i][0] = i;
      frequency[i][1] = 0;
    }

    // Count frequency
    for (int i = 0; i < digits.length; i++) {
      frequency[digits[i]][1]++;
    }

    return frequency;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section: take the input from the user
    System.out.print("Enter a number: ");
    int number = sc.nextInt();

    int[] digits = storeDigits(number);

    // Display section: Display the results
    System.out.println("Count of digits: " + countDigits(number));

    System.out.print("Digits: ");
    for (int i = 0; i < digits.length; i++) {
      System.out.print(digits[i] + " ");
    }
    System.out.println();

    System.out.println("Sum of digits: " + sumOfDigits(digits));
    System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));

    if (isHarshadNumber(number, digits)) {
      System.out.println(number + " is a Harshad Number");
    } else {
      System.out.println(number + " is NOT a Harshad Number");
    }

    int[][] freq = digitFrequency(digits);

    System.out.println("Digit  Frequency");
    for (int i = 0; i < 10; i++) {
      if (freq[i][1] > 0) {
        System.out.println(freq[i][0] + "      " + freq[i][1]);
      }
    }

    sc.close();
  }
}
