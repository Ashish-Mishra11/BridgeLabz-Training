// Writing a java code to find the factors of a number taken as user input
// Create FindingFactors class to find the factors

import java.util.Scanner;
public class FindingFactors {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section: Create variables number to store the value given by users 
    System.out.print("Enter a number: ");
    int number = sc.nextInt();


    // Logic section: Finding the factor using for loop by firstly checking whether it is positive
    if(number > 0) {
      // finding the  factor
      for(int i = 1; i < number; i++) {
        if(number % i ==0) {
        System.out.println("Factor is: " + i);//Display factors
        }
      }
    } else {
      System.out.println("Please enter positive number");
    }
    
    
    sc.close();
  }
}