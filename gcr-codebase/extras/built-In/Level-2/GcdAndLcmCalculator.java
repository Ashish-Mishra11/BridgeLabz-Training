import java.util.Scanner;

public class GcdAndLcmCalculator {

  // Method to get input from user
  public static int getInput(String prompt) {
    Scanner sc = new Scanner(System.in);
    System.out.print(prompt);
    return sc.nextInt();
  }

  // Method to calculate GCD 
  public static int calculateGCD(int a, int b) {
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }

  // Method to calculate LCM using the relation LCM * GCD = a * b
  public static int calculateLCM(int a, int b) {
    int gcd = calculateGCD(a, b);
    return (a * b) / gcd;
  }

  // Method to display the result
  public static void displayResult(int a, int b, int gcd, int lcm) {
    System.out.println("For numbers " + a + " and " + b + ":");
    System.out.println("GCD = " + gcd);
    System.out.println("LCM = " + lcm);
  }

  public static void main(String[] args) {
  
    // Input section: take the users from input
    int num1 = getInput("Enter the first number: ");
    int num2 = getInput("Enter the second number: ");

    // Method calling
    int gcd = calculateGCD(num1, num2);
    int lcm = calculateLCM(num1, num2);

    // Display section: display the results
    displayResult(num1, num2, gcd, lcm);
  }
}
