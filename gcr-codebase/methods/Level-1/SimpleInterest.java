// Create SimpleInterest class to calculate the simple interest based on value given by user

import java.util.Scanner;
public class SimpleInterest {

  // Method section: create method to calculate the simple interest
  public static double calculateInterest(double principal, double rate, double time) {
    double interest = (principal * rate * time) / 100.0;
    return interest;
  }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    // Input section: take user input for principal, rate, time in variables defined
    System.out.println("Enter principal: ");
    double principal = sc.nextDouble();
    System.out.println("Enter rate: ");
    double rate = sc.nextDouble();
    System.out.println("Enter time: ");
    double time = sc.nextDouble();
  
    // Display section: Display the interest calculated
    double simpleInterest = calculateInterest(principal, rate, time);
    System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
    

    sc.close();
  }
}