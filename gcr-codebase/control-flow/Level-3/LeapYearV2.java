// Writing a java code to check whether the given year is leap year or not
// Create LeapYearV2 class to check for leap year

import java.util.Scanner;
public class LeapYearV2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input and declaration section: Create variable year to store the value given by users 
    System.out.println("Enter a year: ");
    int year = sc.nextInt(); 


    // Logic section: Checking whether the given year is a leap year or not using if else statements
     // Displaying the results also
    if(year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))){
      System.out.println("The year " + year + " is a leap year");
    } else {
      System.out.println("The year " + year + " is not a leap year");
    } 


     sc.close();
  }
}