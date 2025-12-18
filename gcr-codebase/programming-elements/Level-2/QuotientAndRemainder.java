// Writing a java code to find quotient and remainder of two numbers
// Create QuotientAndRemainder class to compute quotient and remainder
import java.util.Scanner;
public class QuotientAndRemainder
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    // Input section: Create variables number1 and number2 to store the values given by users
    System.out.print("Enter first number: ");
    int number1 = sc.nextInt();
    System.out.print("Enter second number: ");
    int number2 = sc.nextInt();

    // Logic section: Calculate the quotient and remainder
    int quotient = number1 / number2;
    int remainder = number1 % number2;

    // Display section: Display the results
    System.out.println("The Quotient is " + quotient +
                       " and Reminder is " + remainder +
                       " of two number " + number1 +
                       " and " + number2);

    sc.close();
  }
}
