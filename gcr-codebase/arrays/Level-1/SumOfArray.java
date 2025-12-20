// Create SumOfArray class to calculate the sum of the entered values

import java.util.Scanner;
public class SumOfArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input and declaration section: Create array numbers and initialize variables
    double[] numbers = new double[10]; 
    double totalValue = 0.0;                
    int index = 0;                     
    while (true) {
      System.out.print("Enter a number: ");
      double value = sc.nextDouble();
      // Break if user enters 0 or a negative number
      if (value <= 0) {
        break;
      }
      // Break if array size reaches maximum
      if (index == 10) {
        break;
      }
      // Store value in array and increment index
      numbers[index] = value;
      index++;
    }

    // Logic section: To calculate the total
    for (int i = 0; i < index; i++) {
      totalValue = totalValue + numbers[i];
    }

    // Display section: Display values and total
    System.out.println("Numbers entered:");
    for (int i = 0; i < index; i++) {
      System.out.println(numbers[i]);
    }
    System.out.println("Total = " + totalValue);

    sc.close();
  }
}
