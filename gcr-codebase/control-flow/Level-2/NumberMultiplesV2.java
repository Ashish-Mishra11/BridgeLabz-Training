// Writing a java code to  find all the multiples of a number taken as user input below 100
// Create NumberMultiplesV2 class to  find all the multiples of a number 

import java.util.Scanner;
public class NumberMultiplesV2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input and declaration section: Create variables number to store the value given by users 
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    int counter = 100;// Declare the counter and initialize it with number - 1
 
    // Logic section: Checking whether a number is positive and less than 100 and find multiple using while loop
    if(number > 0 && number < 100) {
      while(counter >=1) {
        if(counter % number == 0) {
          System.out.println("Multiple is: " + counter);//Display the multiples
        }
        counter--;
      }
    } else {
      System.out.println("Please enter positive and below 100 number");
    }

    
    sc.close();
  }
}