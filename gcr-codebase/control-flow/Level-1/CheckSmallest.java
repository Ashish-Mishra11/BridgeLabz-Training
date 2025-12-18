// Writing a java code to check whether the first number is smallest among 3 numbers
// Create CheckSmallest class to check whether the first number is smallest among 3 numbers 
import java.util.Scanner;
public class CheckSmallest
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    // Input section: Create variables number1, number2, and number3 to store the values given by users
    System.out.print("Enter the number1: ");
    int number1 = sc.nextInt();
    System.out.print("Enter the number2: ");
    int number2 = sc.nextInt();
    System.out.print("Enter the number3: ");
    int number3 = sc.nextInt();

    // Logic section: Checking whether first number is smallest among 3
    if(number1 < number2 && number1 < number3)
    { 
        System.out.println("Is the first number the smallest? Yes");// Display Yes if it is smallest
    }
    else 
    {
      System.out.println("Is the first number the smallest? No");// Display No if it is not smallest
    }

    sc.close();

  }
}