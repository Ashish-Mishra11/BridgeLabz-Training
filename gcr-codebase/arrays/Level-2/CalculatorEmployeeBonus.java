// Create CalculatorEmployeeBonus class to calculate bonus and salary details as given

import java.util.Scanner;
public class CalculatorEmployeeBonus {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Declaration section: Declare all necessary variable as asked by problem
    double[] salary = new double[10];
    double[] yearsOfService = new double[10];
    double[] bonus = new double[10];
    double[] newSalary = new double[10];

    double totalBonus = 0.0;
    double totalOldSalary = 0.0;
    double totalNewSalary = 0.0;

    // Input section: Take input salary and years of service from user
    for (int i = 0; i < 10; i++) {
      System.out.println("Enter details for Employee " + (i + 1));
      System.out.print("Enter salary: ");
      salary[i] = sc.nextDouble();
      System.out.print("Enter years of service: ");
      yearsOfService[i] = sc.nextDouble();
      // Validation check
      if (salary[i] <= 0 || yearsOfService[i] < 0) {
        System.out.println("Invalid input. Please enter again.");
        i--; // Decrement index to re-enter values
        continue;
      }
    }

    // Logic section: Calculate bonus and new salary of the employees
    for (int i = 0; i < 10; i++) {
      if (yearsOfService[i] > 5) {
        bonus[i] = salary[i] * 0.05; // 5% bonus
      } else {
        bonus[i] = salary[i] * 0.02; // 2% bonus
      }
      newSalary[i] = salary[i] + bonus[i];
      totalBonus = totalBonus + bonus[i];
      totalOldSalary = totalOldSalary + salary[i];
      totalNewSalary = totalNewSalary + newSalary[i];
    }

    // Display section: Display all values
    System.out.println("\nEmployee Salary Details:");
    for (int i = 0; i < 10; i++) {
      System.out.println(
        "Employee " + (i + 1) +
        "\n Old Salary: " + salary[i] +
        "\n Bonus: " + bonus[i] +
        "\n New Salary: " + newSalary[i]
      );
    }
    System.out.println("\nTotal Bonus Paid: " + totalBonus);
 

    sc.close();
  }
}
