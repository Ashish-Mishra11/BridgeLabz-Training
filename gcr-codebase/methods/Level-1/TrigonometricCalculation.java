// Create TrigonometricCalculation  class to calculate sine, cosine, and tangent using Math class

import java.util.Scanner;
public class TrigonometricCalculation {

  // Method to calculate trigonometric functions
  public static double[] calculateTrigonometricFunctions(double angle) {
    double[] answer = new double[3];
    double radians = Math.toRadians(angle);
    answer[0] = Math.sin(radians);
    answer[1] = Math.cos(radians);
    answer[2] = Math.tan(radians);
    return answer;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section: take the angle from user
    System.out.print("Enter angle in degrees: ");
    double angle = sc.nextDouble();

    // Display section: Display the results 
    double[] result = calculateTrigonometricFunctions(angle);
    System.out.println("Sine value is: " + result[0]);
    System.out.println("Cosine value is: " + result[1]);
    System.out.println("Tangent value is: " + result[2]);

    sc.close();
  }

  
}
