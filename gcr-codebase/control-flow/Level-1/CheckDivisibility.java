// Writing a java code to check if a number is divisible by 5
// Create CheckDivisibility class to check if a number is divisible by 5
import java.util.Scanner;
public class CheckDivisibility
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
 
    // Input section: Create a variable number to store the user input 
    System.out.print("Enter the number whose divisibility you want to check: ");
    int number = sc.nextInt();
    
    // Logic section: Checking whether a number is divisible by 5 
    if(number % 5 == 0)
    {
      System.out.println("Is the number " + number + " divisible by 5? Yes" );// Display Yes the number is divisible by 5
    }
    else
    {
      System.out.println("Is the number " + number + " divisible by 5? No" );// Display No the number is not divisible by 5
    }

    sc.close();
  }
}