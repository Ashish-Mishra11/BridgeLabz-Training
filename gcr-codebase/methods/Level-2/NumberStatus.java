import java.util.Scanner;
public class NumberStatus {

  // Method section: create the necessary methods
  // Method to check whether a number is positive
  public static boolean isPositive(int number) {
    return number >= 0;
  }
  // Method to check whether a number is even
  public static boolean isEven(int number) {
    return number % 2 == 0;
  }
  // Method to compare two numbers
  public static int compare(int number1, int number2) {
    if (number1 > number2) {
      return 1;
    } else if (number1 == number2) {
      return 0;
    } else {
      return -1;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input and Declaration section: create numbers array to store the user input
    int[] numbers = new int[5];
    for (int i = 0; i < numbers.length; i++) {
      System.out.print("Enter number " + (i + 1) + ": ");
      numbers[i] = sc.nextInt();
    }

    // Logic and display section: Check positive/negative and even/odd
    for (int i = 0; i < numbers.length; i++) {
      if (isPositive(numbers[i])) {
        System.out.print(numbers[i] + " is Positive and ");
        if (isEven(numbers[i])) {
          System.out.println("Even");
        } else {
          System.out.println("Odd");
        }
      } else {
        System.out.println(numbers[i] + " is Negative");
      }
    }

    // Compare first and last elements
    int result = compare(numbers[0], numbers[numbers.length - 1]);
    System.out.print("\nComparison of first and last elements: ");
    if (result == 1) {
      System.out.println("First is greater than last");
    } else if (result == 0) {
      System.out.println("First is equal to last");
    } else {
      System.out.println("First is less than last");
    }

    sc.close();
  }
}
