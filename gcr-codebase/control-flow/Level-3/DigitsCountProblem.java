// Writing a Java program to count the number of digits in an integer
// Create DigitsCountProblem class to count digits of a number given

import java.util.Scanner;
public class DigitsCountProblem {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Input and declaration section: Create variable number to store value given by user
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    int count = 0; // Declare variable count and assign 0 to it


    //Logic section: counting the number of digits
    while (number != 0) {
      number = number / 10;
      count++;
    }

    // Display section: Display the count
    System.out.println("Number of digits is: " + count);

    sc.close();
  }
}
