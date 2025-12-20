// Create BMICalculatorArray class to calculate BMI and weight status of persons given by user

import java.util.Scanner;
public class BMICalculatorArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section: Create number of persons variable to take user input
    System.out.print("Enter number of persons: ");
    int numberOfPersons = sc.nextInt();

    // Declaration section: Create arrays for solving problem
    double[] weight = new double[numberOfPersons];
    double[] height = new double[numberOfPersons];
    double[] bmi = new double[numberOfPersons];
    String[] status = new String[numberOfPersons];

    // Input section: Take height and weight of persons from user
    for (int i = 0; i < numberOfPersons; i++) {
      System.out.println("Enter details of Person " + (i + 1));
      System.out.print("Enter weight: ");
      weight[i] = sc.nextDouble();
      System.out.print("Enter height: ");
      height[i] = sc.nextDouble();
    }

    // Logic section: Calculate BMI and determine weight status of person
    for (int i = 0; i < numberOfPersons; i++) {
      bmi[i] = weight[i] / (height[i] * height[i]);
      if (bmi[i] <= 18.4) {
        status[i] = "Underweight";
      } else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
        status[i] = "Normal";
      } else if (bmi[i] >= 25.0 && bmi[i] <= 39.9) {
        status[i] = "Overweight";
      } else {
        status[i] = "Obese";
      }
    }

    // Display section: Display the result
    System.out.println("\nBMI Details of Persons:");
    for (int i = 0; i < numberOfPersons; i++) {
      System.out.println(
        "Person " + (i + 1) +
        " \n Height: " + height[i] +
        " m \n Weight: " + weight[i] +
        " kg \n BMI: " + bmi[i] +
        " \n Status: " + status[i]
      );
    }

    sc.close();
  }
}
