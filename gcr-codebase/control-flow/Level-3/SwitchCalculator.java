// Writing a Java program to create a calculator using switch...case
// Create SwitchCalculator class to perform basic arithmetic operations using switch

import java.util.Scanner;
public class SwitchCalculator {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Input and Declaration section: Create first, second, op variable to take values from users
    System.out.print("Enter first number: ");
    double first = sc.nextDouble();
    System.out.print("Enter second number: ");
    double second = sc.nextDouble();
    System.out.print("Enter operator (+, -, *, /): ");
    String op = sc.next();

    // Logic section: Calculating different operations
     // Display section: Display the result as well
    switch (op) {
      case "+":
        System.out.println("Result is: " + (first + second));
        break;
      case "-":
        System.out.println("Result is: " + (first - second));
        break;
      case "*":
        System.out.println("Result is: " + (first * second));
        break;
      case "/":
        if (second != 0) {
          System.out.println("Result is: " + (first / second));
        } else {
          System.out.println("Division by zero is not allowed.");
        }
        break;
      default:
        System.out.println("Invalid Operator.");
    }

    sc.close();
  }
}
