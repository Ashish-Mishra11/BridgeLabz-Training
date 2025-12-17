// Writing a java code for addition, subtraction, multiplication, division
// Create Calculator class to perform all basic operation
import java.util.Scanner;
public class Calculator
{
  public static void main(String[] args)
  {
    // Input section- Create variables to take input
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    double number1 = sc.nextDouble();
    System.out.print("Enter the second number: ");
    double number2 = sc.nextDouble();
    
    // Addition section
    double add = number1 + number2;
    // Substraction section
    double sub = number1 - number2;
    // Multiplication section
    double mul = number1 * number2;
    // Division section
    double div = number1 / number2;
    
    // Display results 
    System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + add+", "+ sub+", "+ mul+", "+" and "+div);
    sc.close();
  }
}