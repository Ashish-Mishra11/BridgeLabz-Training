// Create AthleteRounds class to calculate the number of rounds athlete have to run to cover 5000m

import java.util.Scanner;
public class AthleteRounds {

  // Method section: create method to calculate the simple interest
  public static int  calculatenumberOfRounds(double firstSide, double secondSide, double thirdSide) {
    double perimeter = firstSide + secondSide + thirdSide;
    double total = 5000;
    int number = (int)((total + (perimeter - 1)) / perimeter);
    return number;
  }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    // Input section: Take user input for 3 sides of a triangle 
    System.out.println("Enter first side: ");
    double firstSide = sc.nextDouble();
    System.out.println("Enter second side: ");
    double secondSide = sc.nextDouble();
    System.out.println("Enter third side: ");
    double thirdSide = sc.nextDouble();
  
    // Display section: Display the number of rounds calculated
    int numberOfRounds = calculatenumberOfRounds(firstSide, secondSide, thirdSide);
    System.out.println("The number of rounds are: " + numberOfRounds);
    

    sc.close();
  }
}