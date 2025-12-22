import java.util.Scanner;

public class NumberCheckerThree {

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
  // Method to store digits of number in array
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
  // Method to reverse the digits array
  public static int[] reverseDigits(int[] digits) {
    int[] reversed = new int[digits.length];

    for (int i = 0; i < digits.length; i++) {
      reversed[i] = digits[digits.length - 1 - i];
    }
    return reversed;
  }
  // Method to compare two arrays
  public static boolean compareArrays(int[] a, int[] b) {
    if (a.length != b.length) {
      return false;
    }

    for (int i = 0; i < a.length; i++) {
      if (a[i] != b[i]) {
        return false;
      }
    }
    return true;
  }
  // Method to check palindrome number using digits
  public static boolean isPalindrome(int[] digits) {
    int[] reversed = reverseDigits(digits);
    return compareArrays(digits, reversed);
  }
  // Method to check Duck Number using digits array
  public static boolean isDuckNumber(int[] digits) {
    for (int i = 0; i < digits.length; i++) {
      if (digits[i] != 0) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section: take the input from the users
    System.out.print("Enter a number: ");
    int number = sc.nextInt();

    int[] digits = storeDigits(number);
    int[] reversed = reverseDigits(digits);

    // Display section: Display the results
    System.out.println("Count of digits: " + countDigits(number));

    System.out.print("Digits array: ");
    for (int i = 0; i < digits.length; i++) {
      System.out.print(digits[i] + " ");
    }
    System.out.println();

    System.out.print("Reversed digits array: ");
    for (int i = 0; i < reversed.length; i++) {
      System.out.print(reversed[i] + " ");
    }
    System.out.println();

    System.out.println("Arrays equal: " + compareArrays(digits, reversed));

    if (isPalindrome(digits)) {
      System.out.println(number + " is a Palindrome Number");
    } else {
      System.out.println(number + " is NOT a Palindrome Number");
    }

    if (isDuckNumber(digits)) {
      System.out.println(number + " is a Duck Number");
    } else {
      System.out.println(number + " is NOT a Duck Number");
    }

    sc.close();
  }
}
