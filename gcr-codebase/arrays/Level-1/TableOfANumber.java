// Create TableOfANumber class to store and display table values of that number

import java.util.Scanner;
public class TableOfANumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input and declaration section: Create variable number to store the value given by user
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    int[] table = new int[10];// Create array table to store the values of table

    // Logic section: use for loop to determine the table 
    for (int i = 1; i <= table.length; i++) {
      table[i - 1] = number * i; // Store result in array
    }

    // Display section: Display multiplication table
    for (int i = 1; i <= table.length; i++) {
      System.out.println(number + " * " + i + " = " + table[i - 1]);
    }

    sc.close();
  }
}
