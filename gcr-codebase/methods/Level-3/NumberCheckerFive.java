import java.util.Scanner;

public class NumberCheckerFive {

  // Method section: create the necessary methods
  // Method to check if a number is a perfect number
  public static boolean isPerfectNumber(int number) {
    if (number <= 0) return false;

    int sum = 0;
    for (int i = 1; i <= number / 2; i++) {
      if (number % i == 0) {
        sum = sum + i;
      }
    }
    return sum == number;
  }
  // Method to check if a number is an abundant number
  public static boolean isAbundantNumber(int number) {
    if (number <= 0) return false;

    int sum = 0;
    for (int i = 1; i <= number / 2; i++) {
      if (number % i == 0) {
        sum = sum + i;
      }
    }
    return sum > number;
  }
  // Method to check if a number is a deficient number
  public static boolean isDeficientNumber(int number) {
    if (number <= 0) return false;

    int sum = 0;
    for (int i = 1; i <= number / 2; i++) {
      if (number % i == 0) {
        sum = sum + i;
      }
    }
    return sum < number;
  }
  // Method to find factorial of a digit
  public static int factorial(int digit) {
    int fact = 1;
    for (int i = 1; i <= digit; i++) {
      fact = fact * i;
    }
    return fact;
  }
  // Method to check if a number is a strong number
  public static boolean isStrongNumber(int number) {
    int temp = number;
    int sum = 0;

    while (temp != 0) {
      int digit = temp % 10;
      sum = sum + factorial(digit);
      temp = temp / 10;
    }
    return sum == number;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section: take the inputs from the users
    System.out.print("Enter a number: ");
    int number = sc.nextInt();

    // Display section: Display the results
    System.out.println("Perfect Number: " + isPerfectNumber(number));
    System.out.println("Abundant Number: " + isAbundantNumber(number));
    System.out.println("Deficient Number: " + isDeficientNumber(number));
    System.out.println("Strong Number: " + isStrongNumber(number));

    sc.close();
  }
}
