// Writing a java code to print the greatest factor of a number beside itself using a loop
// Create GreatestFactor class to print the greatest factor of a number

import java.util.Scanner;
public class GreatestFactor {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input and declaration section: Create variables number to store the value given by users 
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    int greatestFactor = 1;// Declare a varaiable greatestFactor and assign it to 1


    // Logic section: Finding the greatestFactor using for loop
    for(int i = number - 1; i >= 1; i--){
      if(number % i == 0) {
        greatestFactor = i;
        break;
      }
    }

    // Display section: Display the greatestFactor
    System.out.println("The Greatest factor is: "+ greatestFactor);
    
    
    sc.close();
  }
}