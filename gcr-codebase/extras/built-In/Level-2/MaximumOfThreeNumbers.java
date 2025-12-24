import java.util.Scanner;

public class MaximumOfThreeNumbers {

  // Method to take integer input from the user
  public static int getInput(String prompt) {
    Scanner sc = new Scanner(System.in);
    System.out.print(prompt);
    return sc.nextInt();
  }

  // Method to find the maximum of three numbers
  public static int findMaximum(int num1, int num2, int num3) {
    int max = num1;

    if (num2 > max) {
      max = num2;
    }
    if (num3 > max) {
      max = num3;
    }
    return max;
  }

  public static void main(String[] args) {

    // Input section: Taking three inputs from the user
    int num1 = getInput("Enter the first number: ");
    int num2 = getInput("Enter the second number: ");
    int num3 = getInput("Enter the third number: ");

    //method calling
    int maximum = findMaximum(num1, num2, num3);

    // Displaying the result
    System.out.println("The maximum of the three numbers is: " + maximum);
  }
}
