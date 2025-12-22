// Create SmallestAndLargestNumber class to  find the smallest and the largest of the 3 numbers

import java.util.Scanner;
public class SmallestAndLargestNumber {

  // Method section: create method to calculate the smallest and largest
  public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
    int number[] = new int[2];
    if(number1 < number2 && number1 < number3) {
      number[0] = number1;
    } else if (number2 < number1 && number2 < number3) {
      number[0] = number2;
    } else {
      number[0] = number3;
    }
    if(number1 > number2 && number1 > number3) {
      number[1] = number1;
    } else if (number2 > number1 && number2 > number3) {
      number[1] = number2;
    } else {
      number[1] = number3;
    }
    return number;
  }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    // Input section: Take user input for 3 numbers
    System.out.println("Enter first number: ");
    int number1 = sc.nextInt();
    System.out.println("Enter second number: ");
    int number2 = sc.nextInt();
    System.out.println("Enter third number: ");
    int number3 = sc.nextInt();
    
    // Display section: Display the smallest and largest number among 3 calculated
    int smallestAndLargest[] = findSmallestAndLargest(number1, number2, number3);
    System.out.println("The smallest number: " + smallestAndLargest[0] +
                       "\nThe largest number: " + smallestAndLargest[1]
                       );
    

    sc.close();
  }
}