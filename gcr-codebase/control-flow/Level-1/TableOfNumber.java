// Writing a java code to print multiplication table of a number entered by the user from 6 to 9
// Create TableOfNumber class to print the table of given number in given range

import java.util.Scanner;
public class TableOfNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        
    // Input and declaration section: Create variable number to store the values given by user
    System.out.print("Enter the number: ");
    int number = sc.nextInt();

    // Logic section: Printing table of given number from 6 to 9 using for loop
    for(int i=6; i<=9; i++) {
      // Display the table of given number
      System.out.println(number + " * " + i + " = " + (number * i));
    }    

    
    sc.close();
  }
}