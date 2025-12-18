// Writing a java code to find the bonus of employees based on their years of service
// Create BonusOfEmployees class to find the bonus amount

import java.util.Scanner;
public class BonusOfEmployees {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        
    // Input and declaration section: Create variable salary and year to store the values given by user
    System.out.print("Enter the salary: ");
    int salary = sc.nextInt();
    System.out.print("Enter the year: ");
    int year = sc.nextInt();
    double bonusAmt = 0.0;

    // Logic section: use conditional statements to calculate bonus amount
    if(year > 5) {
      bonusAmt = (5 / 100.0) * salary;
      //Display section: Display the bonus amount
      System.out.println("The calculated bonus amount is: " + bonusAmt);
    } else {
      System.out.println("No bonus because of less year of experience");
    }

   
    sc.close();
  }
}