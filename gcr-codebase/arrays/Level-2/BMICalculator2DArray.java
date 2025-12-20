// Create BMICalculator2DArray class to calculate BMI using multi-dimensional array

import java.util.Scanner;
public class BMICalculator2DArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section: Take number of persons
    System.out.print("Enter number of persons: ");
    int number = sc.nextInt();

    // Declaration section: declare the necessary array and multi D array
    double[][] personData = new double[number][3];
    String[] weightStatus = new String[number];

    // Input section: Take weight and height with validation of number
    for (int i = 0; i < number; i++) {
      System.out.println("\nEnter details of Person " + (i + 1));
      System.out.print("Enter weight (in kg): ");
      personData[i][0] = sc.nextDouble();
      System.out.print("Enter height (in meters): ");
      personData[i][1] = sc.nextDouble();
      // Validation for negative or zero values
      if (personData[i][0] <= 0 || personData[i][1] <= 0) {
        System.out.println("Invalid input. Please enter positive values.");
        i--; // Decrement index to re-enter values
      }
    }

    // Logic section: Calculate BMI and determine weight status
    for (int i = 0; i < number; i++) {
      personData[i][2] =
        personData[i][0] / (personData[i][1] * personData[i][1]);
      if (personData[i][2] <= 18.4) {
        weightStatus[i] = "Underweight";
      } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
        weightStatus[i] = "Normal";
      } else if (personData[i][2] >= 25.0 && personData[i][2] <= 39.9) {
        weightStatus[i] = "Overweight";
      } else {
        weightStatus[i] = "Obese";
      }
    }

    // Display section: Display the results
    for (int i = 0; i < number; i++) {
      System.out.println(
        "Person " + (i + 1) +
        " \n Height: " + personData[i][1] +
        " m \n Weight: " + personData[i][0] +
        " kg \n BMI: " + personData[i][2] +
        " \n Status: " + weightStatus[i]
      );
    }

    sc.close();
  }
}
