// Writing a Java program to check whether a number is an Armstrong number 
// Create ArmstrongNumberOrNot class to perform Armstrong number check for program

import java.util.Scanner;
public class ArmstrongNumberOrNot {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Input and declaration section: Create variable number to store value given by user
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    int sum = 0;// Declare variable sum and assign 0 to it
    int originalNumber = number;// Declare variable originalNumber and assign number to it

    // Loop section: checking armstrong number or not
    while (originalNumber != 0) {
      int digit = originalNumber % 10;
      sum = sum + (digit * digit * digit);
      originalNumber = originalNumber / 10;
    }

    // Display section: Display the results
    if (sum == number) {
      System.out.println(number + " is an Armstrong Number.");
    } else {
      System.out.println(number + " is NOT an Armstrong Number.");
    }

    sc.close();
  }
}
