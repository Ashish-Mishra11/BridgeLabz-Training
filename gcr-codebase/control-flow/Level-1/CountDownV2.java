// Writing a java code to count down the number from the user input value to 1 using a for loop
// Create CountDownV2 class to count down the number from the user input value to 1 using a for loop

import java.util.Scanner;
public class CountDownV2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
    // Input section: Create variable counter to store the value given by users
    System.out.print("Enter the counter number: ");
    int counter = sc.nextInt();

    // Logic section: Count down the number using for loop
    for( ; counter >= 1; counter--) {
      System.out.print(counter + " ");// Display count down values
    }

    sc.close();
  }
}