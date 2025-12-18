// Writing a java code to print odd and even numbers between 1 to the number entered by the user
// Create EvenAndOdd class to print odd and even numbers between 1 to the number entered by the user

import java.util.Scanner;
public class EvenAndOdd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        
    // Input and declaration section: Create variable number to store the number given by user
    System.out.print("Enter the number: ");
    int number = sc.nextInt();

    // Logic section: Check for whether number is natural and
    // Printing even and odd between 1 and number entered using for loop
    if(number > 0) { 
      for(int i = 1; i <= number; i++) {
        // printing even and odd
        if(i % 2 == 0) {
          System.out.println(i + " is the even number");// Display the result
        } else {
          System.out.println(i + " is the odd number");// Display the result
        }
      }  
    } else {
      System.out.println("Please enter the natural number");
    }

   
    sc.close();
  }
}