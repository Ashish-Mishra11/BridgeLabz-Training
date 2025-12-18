// Writing a java code to check if the first, second, or third number is the largest of the three.
// Create CheckLargest class to check if the first, second, or third number is the largest of the three.
import java.util.Scanner;
public class CheckLargest
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);

    // Input section: Create variables number1, number2, and number3 to store the values given by users
    System.out.print("Enter the number1: ");
    int number1 = sc.nextInt();
    System.out.print("Enter the number2: ");
    int number2 = sc.nextInt();
    System.out.print("Enter the number3: ");
    int number3 = sc.nextInt();

    // Logic section: checking if the first, second, or third number is the largest of the three
    if(number1 > number2 && number1 > number3)
    {
      // Display results
      System.out.println("Is the first number the largest? Yes \nIs the second number the largest? No \nIs the third number the largest? No");
    }
    else if(number2 > number1 && number2 > number3)
    {
      // Display results
      System.out.println("Is the first number the largest? No \nIs the second number the largest? Yes \nIs the third number the largest? No");
    }
    else if(number3 > number1 && number3 > number2)
    {
      // Display results
      System.out.println("Is the first number the largest? No \nIs the second number the largest? No \nIs the third number the largest? Yes");
    }
    else
    {
      // Display results
      System.out.println("Is the first number the largest? No \nIs the second number the largest? No \nIs the third number the largest? No");
    }
    
    sc.close();
  }
}