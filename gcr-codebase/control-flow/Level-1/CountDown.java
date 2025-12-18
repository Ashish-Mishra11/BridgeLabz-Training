// Writing a java code to count down the number from the user input value to 1 using a while loop
// Create CountDown class to count down the number from the user input value to 1 using a while loop

import java.util.Scanner;
public class CountDown {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
    // Input section: Create variable counter to store the value given by users
    System.out.print("Enter the counter number: ");
    int counter = sc.nextInt();

    // Logic section: Count down the number using while loop
    while(counter >=1 ) {
      System.out.print(counter + " ");// Display the count down values
      counter--;
    }

    sc.close();
  }
}