// Create LeapYear class to check for leap year

import java.util.Scanner;
public class LeapYear {

  // Method section: create the method to find whether a year is leap year or not
  public static void findLeapYear(int year) {
    if(year >= 1582) {
      if(year % 400 == 0) {
        System.out.println("The year " + year + " is a leap year");
      } else if(year % 4 ==0 && year % 100 != 0) {
        System.out.println("The year " + year + " is a leap year");
      } else {
        System.out.println("The year " + year + " is not a leap year");
      }

    } else {
      System.out.println("Please enter the correct year based on condition");
    } 
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input and declaration section: Create variable year to store the value given by users 
    System.out.println("Enter a year: ");
    int year = sc.nextInt(); 

    // Display section: Display the result by calling method
    findLeapYear(year);

     sc.close();
  }
}