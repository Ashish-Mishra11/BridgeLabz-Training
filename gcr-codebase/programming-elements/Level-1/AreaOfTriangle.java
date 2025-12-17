// Writing a java code to find the area of a triangle
// Create AreaOfTriangle class to compute area in square inches and square centimeters
import java.util.Scanner;
public class AreaOfTriangle
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    // Input section: Create variable baseInInches and heightInInches to accept the values from user
    System.out.print("Enter base in inches: ");
    double baseInInches = sc.nextDouble();
    System.out.print("Enter height in inches: ");
    double heightInInches = sc.nextDouble();

    // Logic section: Calculation of area of triangle in square inches and square centimeters
    double areaInSqInches = 0.5 * baseInInches * heightInInches;
    double areaInSqCm = areaInSqInches * 6.4516;

    // Display section: Display area in square inches and square centimeters
    System.out.println("Area of triangle in square inches is: " + areaInSqInches + "\n" +
                       "Area of triangle in square centimeters is: " + areaInSqCm);

    sc.close();
  }
}
