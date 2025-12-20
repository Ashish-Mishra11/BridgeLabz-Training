// Create FactorsOfANumber class to store and display factors

import java.util.Scanner;
public class FactorsOfANumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input and declaration section: Take number from user
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    int maxFactor = 10;// Initial array size
    int[] factors = new int[maxFactor];
    int index = 0;// Index for factors array

    // Logic section: Finding factor and assign it to the array
    for (int i = 1; i <= number; i++) {
      if (number % i == 0) {
        // If array is full, increase its size
        if (index == maxFactor) {
          maxFactor = maxFactor * 2;
          int[] temp = new int[maxFactor];          
          for (int j = 0; j < factors.length; j++) {
            temp[j] = factors[j];
          }
          factors = temp;
        }
        factors[index] = i;
        index++;
      }
    }

    // Display section: Display factors
    System.out.println("Factors of " + number + ":");
    for (int i = 0; i < index; i++) {
      System.out.print(factors[i] + " ");
    }

    sc.close();
  }
}
