public class ZaraBonusUsingMethods {

  // Method section: create the necessary methods
  // Method to generate salary and years of service
  public static double[][] generateEmployeeData(int employees) {
    double[][] data = new double[employees][2];

    for (int i = 0; i < employees; i++) {
      // 5-digit salary (10000 – 99999)
      data[i][0] = (int)(Math.random() * 90000) + 10000;

      // Years of service (1 – 10)
      data[i][1] = (int)(Math.random() * 10) + 1;
    }
    return data;
  }
  // Method to calculate new salary and bonus
  public static double[][] calculateBonus(double[][] data) {
    double[][] result = new double[data.length][2];

    for (int i = 0; i < data.length; i++) {
      double salary = data[i][0];
      double years = data[i][1];
      double bonus;

      if (years > 5)
        bonus = salary * 0.05;
      else
        bonus = salary * 0.02;

      result[i][0] = salary + bonus; // New Salary
      result[i][1] = bonus;          // Bonus Amount
    }
    return result;
  }
  // Method to display totals in tabular format
  public static void displaySummary(double[][] oldData, double[][] newData) {

    double totalOldSalary = 0;
    double totalNewSalary = 0;
    double totalBonus = 0;

    System.out.println("Emp\tOldSalary\tYears\tBonus\tNewSalary");

    for (int i = 0; i < oldData.length; i++) {
      double oldSalary = oldData[i][0];
      double years = oldData[i][1];
      double newSalary = newData[i][0];
      double bonus = newData[i][1];

      totalOldSalary += oldSalary;
      totalNewSalary += newSalary;
      totalBonus += bonus;

      System.out.println(
        (i + 1) + "\t" +
        (int)oldSalary + "\t\t" +
        (int)years + "\t" +
        (int)bonus + "\t" +
        (int)newSalary
      );
    }

    System.out.println("\nTotal Old Salary : " + (int)totalOldSalary);
    System.out.println("Total Bonus Paid : " + (int)totalBonus);
    System.out.println("Total New Salary : " + (int)totalNewSalary);
  }

  public static void main(String[] args) {

    // Input section: generate the random values for inputs 
    int employees = 10;

    double[][] employeeData = generateEmployeeData(employees);
    double[][] updatedData = calculateBonus(employeeData);
 
    // Method call for display
    displaySummary(employeeData, updatedData);
  }
}
