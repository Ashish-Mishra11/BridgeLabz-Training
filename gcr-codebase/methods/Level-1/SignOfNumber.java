// Create SignOfNumber class to find whether a number is positive, negative, or zero

import java.util.Scanner;
public class SignOfNumber {

  // Method section: create method to calculate sign of number
  public static int findSign(int number) {
    if(number > 0) {
      return 1;
    } else if(number < 0) {
      return -1;
    } else {
      return 0;
    }
  }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    // Input section: take user input for numberOfStudents
    System.out.println("Enter number: ");
    int number = sc.nextInt();
    
    // Display section: Display the sign of number calculated
    int numberCalculated = findSign(number);
    if(number == 0) {
      System.out.println("number is zero");
    } else if(number < 0) {
      System.out.println("number is negative");
    } else {
      System.out.println("number is positive");
    }

    sc.close();
  }
}