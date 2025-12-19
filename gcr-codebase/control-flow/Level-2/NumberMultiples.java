// Writing a java code to  find all the multiples of a number taken as user input below 100
// Create NumberMultiples class to  find all the multiples of a number 

import java.util.Scanner;
public class NumberMultiples {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input and declaration section: Create variables number to store the value given by users 
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
 
    // Logic section: Checking whether a number is positive and less than 100 and find multiple using for loop
    if(number > 0 && number < 100) {
      for(int i = 100; i>=1; i--) {
        if(i % number == 0) {
          System.out.println("Multiple is: " + i);//Display the multiples
          continue;
        }
      }
    } else {
      System.out.println("Please enter positive and below 100 number");
    }

    
    sc.close();
  }
}