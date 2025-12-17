// Writing a java code to find the side of the square 
// Create SquareSide class to calculate the sides of square
import java.util.Scanner;
public class SquareSide
{
  public static void main(String[] args)
  {
    // Input of perimeter
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the perimeter of square: ");
    double perimeter = sc.nextDouble();

    // logic to find the side of square
    double sideOfSquare = perimeter / 4;

    // Display the sides of square
    System.out.println("The length of the side is " + sideOfSquare + " whose perimeter is " + perimeter);
    sc.close();
  }
}