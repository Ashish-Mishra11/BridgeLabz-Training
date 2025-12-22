// Create SumOfNaturalNumber class to calculate natural number using recursive method and formula

import java.util.Scanner;
public class SumOfNaturalNumber {

  // Method section: create method to calculate sum using recursion
  public static int calculateSumRecursion(int number) {
    if(number == 0) {
      return 0;
    } else {
      return number + calculateSumRecursion(number - 1);
    }
  }
  // Method section: create method to calculate sum using formula
  public static int calculateSumFormula(int number) {
    int sum = number*(number+1)/2;
    return sum;
  }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    // Input section: take user input for number
    System.out.println("Enter number: ");
    int number = sc.nextInt();
    
    // Display section: Display the results calculated
    int result1 = calculateSumRecursion(number);
    int result2 = calculateSumFormula(number);
    System.out.println("The sum through recursion: " + result1 + 
                       "\n The sum through formula: " + result2 +
                       "\n The final result is: " + result1
                       );
    

    sc.close();
  }
}