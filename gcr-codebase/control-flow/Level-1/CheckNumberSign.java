// Writing a java code to check whether a number is positive, negative, or zero.
// Create CheckNumberSign class to check whether a number is positive, negative, or zero.

import java.util.Scanner;
public class CheckNumberSign {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        
    // Input section: Create variable number to store the value given by user 
    System.out.print("Enter the number: ");
    int number = sc.nextInt();

    // Logic section: Check whether a number is positive, negative, or zero using conditional statements
    if(number == 0) {
      System.out.println("The number given is zero");// Display a message to check whether a number is positive, negative, or zero
    } else if(number > 0) {
      System.out.println("The number given is positive number");// Display a message to check whether a number is positive, negative, or zero
    } else {
      System.out.println("The number given is negative number");// Display a message to check whether a number is positive, negative, or zero
    }

    sc.close();
  }
}