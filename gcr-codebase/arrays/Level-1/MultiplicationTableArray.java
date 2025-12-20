// Create MultiplicationTableArray class to store and display table values

import java.util.Scanner;
public class MultiplicationTableArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input and declaration section: Create variable number and array multiplicationResult 
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    int[] multiplicationResult = new int[4];
    int index = 0;


    // Logic section: Create array to store multiplication results 
    for (int i = 6; i <= 9; i++) {
      multiplicationResult[index] = number * i;
      index++;
    }

    // Display section: Display multiplication table
    index = 0;
    for (int i = 6; i <= 9; i++) {
      System.out.println(number + " * " + i + " = " + multiplicationResult[index]);
      index++;
    }

    sc.close();
  }
}
