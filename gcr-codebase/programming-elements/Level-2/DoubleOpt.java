// Writing a java code to perform double operations
// Create DoubleOpt class to compute arithmetic expressions using double values
import java.util.Scanner;
public class DoubleOpt
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    // Input section: Create variables a, b, and c to store the values given by users 
    System.out.print("Enter value of a: ");
    double a = sc.nextDouble();
    System.out.print("Enter value of b: ");
    double b = sc.nextDouble();
    System.out.print("Enter value of c: ");
    double c = sc.nextDouble();

    // Logic section: Double operations
    double output1 = a + b * c;
    double output2 = a * b + c;
    double output3 = c + a / b;
    double output4 = a % b + c;

    // Display section: Display the double operations results
    System.out.println("The results of Double Operations are " +
                        output1 + ", " +
                        output2 + ", " +
                        output3 + ", and " +
                        output4);

    sc.close();
  }
}
