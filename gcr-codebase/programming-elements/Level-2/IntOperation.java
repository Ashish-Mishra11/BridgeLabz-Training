// Writing a java code to perform integer operations
// Create IntOperation class to compute arithmetic expressions
import java.util.Scanner;
public class IntOperation
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    // Input section: Create variables a, b, and c to store the values given by users
    System.out.print("Enter value of a: ");
    int a = sc.nextInt();
    System.out.print("Enter value of b: ");
    int b = sc.nextInt();
    System.out.print("Enter value of c: ");
    int c = sc.nextInt();

    // Logic section: Integer operations
    int output1 = a + b * c;
    int output2 = a * b + c;
    int output3 = c + a / b;
    int output4 = a % b + c;

    // Display section: Display the results of integer operations
    System.out.println("The results of Int Operations are " +
                        output1 + ", " +
                        output2 + ", " +
                        output3 + ", and " +
                        output4);

    sc.close();
  }
}
