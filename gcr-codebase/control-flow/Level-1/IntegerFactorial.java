// Writing a java code to find the factorial of an integer entered by the user
// Create IntegerFactorial class to find the factorial of an integer entered by the user  

import java.util.Scanner;
public class IntegerFactorial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
    // Input and declaration section: Create variable number to store the number given by user
    System.out.print("Enter the number: ");
    int number = sc.nextInt();
    int factorial = 1;

    // Logic section: Check the user has entered positive number and find factorial of it using while loop
    if(number > 0) {
      while(number > 0) {
        factorial *= number;
        number--; 
      }
      System.out.println("The Factorial of given number is: " + factorial);//Display the results
    } else {
      System.out.println("Please enter the positive number");//Display the results    
    }
   
    sc.close();
  }
}