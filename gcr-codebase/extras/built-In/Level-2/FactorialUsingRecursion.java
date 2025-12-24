import java.util.Scanner;

public class FactorialUsingRecursion {

  // Method to get input from user
  public static int getInput(String prompt) {
    Scanner sc = new Scanner(System.in);
    System.out.print(prompt);
    return sc.nextInt();
  }

  // Recursive method to calculate factorial
  public static long factorial(int n) {
    if (n <= 1) {
      return 1;
    }
    return n * factorial(n - 1);
  }

  // Method to display result
  public static void displayResult(int n, long result) {
    System.out.println("Factorial of " + n + " is: " + result);
  }

  public static void main(String[] args) {

    // Input section: take the user inputs
    int number = getInput("Enter a number to calculate factorial: ");

    if (number < 0) {
      System.out.println("Factorial is not defined for negative numbers.");
    } else {
      long fact = factorial(number);
      displayResult(number, fact);
    }
  }
}
