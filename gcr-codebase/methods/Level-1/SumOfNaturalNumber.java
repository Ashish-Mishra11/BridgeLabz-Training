// Create SumOfNaturalNumber class to find the sum of n natural numbers using loop

import java.util.Scanner;
public class SumOfNaturalNumber {

  // Method section: create method to calculate the number of handshakes
  public static int calculateSumNaturalNumber(int number) {
    // Create variable total to store the total value calculated through while loop
    int total = 0;
    while(number > 0) {
        total += number;
        number--;
    }
    return total;
  }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    // Input section: take user input for number
    System.out.println("Enter number: ");
    int number = sc.nextInt();
    
    // Display section: Display the sum of natural number calculated
    int sumOfNatural = calculateSumNaturalNumber(number);
    System.out.println("The sum of n natural number is: " + sumOfNatural);
    

    sc.close();
  }
}