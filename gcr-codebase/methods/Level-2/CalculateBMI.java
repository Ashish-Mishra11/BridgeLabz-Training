import java.util.Scanner;
public class CalculateBMI {

  // Method section: Method to calculate BMI and display result with status
  public static void calculateBMI(double[][] data) {
    for (int i = 0; i < data.length; i++) {
      double weight = data[i][0];
      double height = data[i][1];
      double heightMeter = height / 100;
      double bmi = weight / (heightMeter * heightMeter);
      data[i][2] = bmi;
      String status;
      if (bmi < 18.5) {
        status = "Underweight";
      } else if (bmi < 25) {
        status = "Normal";
      } else if (bmi < 30) {
        status = "Overweight";
      } else {
        status = "Obese";
      }
      // Display section
      System.out.println("Height(cm)  Weight(kg)  BMI  Status");
      System.out.println(height + "  " + weight + "  " + bmi + "  " + status);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input and declaration section: create 2D data array to store user inputs
    double[][] data = new double[10][3];
    for (int i = 0; i < data.length; i++) {
      System.out.println("Enter details for Person " + (i + 1));
      System.out.print("Enter weight (kg): ");
      data[i][0] = sc.nextDouble();
      System.out.print("Enter height (cm): ");
      data[i][1] = sc.nextDouble();
    }

    // Method calling
    calculateBMI(data);

    sc.close();
  }
}
