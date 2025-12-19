// Writing a java code to find the power of a number
// Create PowerOfNumberV2 class to calculate power of a number

import java.util.Scanner;
public class PowerOfNumberV2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input and declaration section: Create variables number and power to store the value given by users 
    System.out.println("Enter a number: ");
    int number = sc.nextInt();
    System.out.println("Enter a power: ");
    int power = sc.nextInt();
    int result = 1;// Declare result variable and initialize it with 1
    int counter = 0;// Declare counter variable and initialize it with 0
 
    // Logic section: Calculating the power of number by firstly checking the positive number (user input)
    if(number > 0 && power > 0) {
      while(counter < power) {
        result *= number;
        counter++;
      }
      System.out.println("The result is: " + result); // Display section: Display the result
    } else {
      System.out.println("please enter positive values");
    }
    
    sc.close();
  }
}