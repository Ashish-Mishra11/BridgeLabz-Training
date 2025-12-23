import java.util.Scanner;

public class CalculationOfBMI {

  //Method section: create the necessary methods
  // Method to calculate BMI and Status for a person
  public static String[] calculateBMIAndStatus(double weight, double heightCm) {
    double heightM = heightCm / 100; // convert cm to meters
    double bmi = weight / (heightM * heightM);

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

    return new String[] {
      String.format("%.2f", heightCm),
      String.format("%.2f", weight),
      String.format("%.2f", bmi),
      status
    };
  }
  // Method to compute BMI details for all persons
  public static String[][] computeBMIDetails(double[][] data) {
    String[][] result = new String[data.length][4];

    for (int i = 0; i < data.length; i++) {
      String[] bmiData = calculateBMIAndStatus(data[i][0], data[i][1]);
      result[i] = bmiData;
    }

    return result;
  }
  // Method to display BMI details in tabular format
  public static void displayBMIReport(String[][] report) {
    System.out.println("-----------------------------------------------------------");
    System.out.println("Height(cm)\tWeight(kg)\tBMI\t\tStatus");
    System.out.println("-----------------------------------------------------------");

    for (int i = 0; i < report.length; i++) {
      System.out.println(
        report[i][0] + "\t\t" +
        report[i][1] + "\t\t" +
        report[i][2] + "\t\t" +
        report[i][3]
      );
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double[][] data = new double[10][2];
  
    // Input section: take the user inputs
    for (int i = 0; i < 10; i++) {
      System.out.println("Enter details for Person " + (i + 1));

      System.out.print("Weight (kg): ");
      data[i][0] = sc.nextDouble();

      System.out.print("Height (cm): ");
      data[i][1] = sc.nextDouble();
    }

    // Method call & Display the results
    String[][] bmiReport = computeBMIDetails(data);
    displayBMIReport(bmiReport);

    sc.close();
  }
}
