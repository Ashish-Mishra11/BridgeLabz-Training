// Writing a java code to find the factorial of an integer entered by the user
// Create IntegerFactorialV2 class to find the factorial of an integer entered by the user  

import java.util.Scanner;
public class IntegerFactorialV2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
    // Input and declaration section: Create variable number to store the number given by user
    System.out.print("Enter the number: ");
    int number = sc.nextInt();
    int factorial = 1;

    // Logic section: Check the user has entered positive number and find factorial of it using for loop
    if(number > 0) {
      for( ; number > 0; number--) {
        factorial *= number;
      }
      System.out.println("The Factorial of given number is: " + factorial);//Display the results
    } else {
      System.out.println("Please enter the positive number");//Display the results    
    }
   
    sc.close();
  }
}