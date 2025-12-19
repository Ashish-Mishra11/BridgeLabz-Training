// Writing a java code to find the factors of a number taken as user input
// Create FindingFactorsV2 class to find the factors

import java.util.Scanner;
public class FindingFactorsV2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section: Create variables number to store the value given by users 
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    int i = 1;


    // Logic section: Finding the factor using while loop by firstly checking whether the given number is positive
    if(number > 0) {
      // finding the  factor
      while(i < number) {
        if(number % i ==0) {
        System.out.println("Factor is: " + i);//Display factors
        }
        i++;
      }
    } else {
      System.out.println("Please enter positive number");
    }
    
    
    sc.close();
  }
}