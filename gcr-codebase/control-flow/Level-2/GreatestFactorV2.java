// Writing a java code to print the greatest factor of a number beside itself using a loop
// Create GreatestFactorV2 class to print the greatest factor of a number

import java.util.Scanner;
public class GreatestFactorV2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input and declaration section: Create variables number to store the value given by users 
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    int greatestFactor = 1;// Declare a varaiable greatestFactor and assign it to 1
    int counter = number - 1;// Declare a variable counter and assign it to number - 1

    // Logic section: Finding the greatestFactor using while loop
    while(counter >=1 ){
      if(number % counter == 0) {
        greatestFactor = counter;
        break;
      }
      counter--;
    }

    // Display section: Display the greatestFactor
    System.out.println("The Greatest factor is: "+ greatestFactor);
    
    
    sc.close();
  }
}