import java.util.Scanner;
public class UnitConvertorTwo {
    
  //Method section: create the static methods
  //Method to convert Yards to Feet
  public static double convertYardsToFeet(double yards) {
    double yards2feet = 3;
    return yards * yards2feet;
  }
  //Method to convert Feet to yards
  public static double convertFeetToYards(double feet) {
    double feet2yards = 0.333333;
    return feet * feet2yards;
  } 
  //Method to convert meters to Inches
  public static double convertMetersToInches(double meters) {
    double meters2inches = 39.3701;
    return meters * meters2inches;
  }
  //Method to convert Inches to meters
  public static double convertInchesToMeters(double inches) {
    double inches2meters = 0.0254;
    return inches * inches2meters;
  }
  //Method to convert Inches to Centimeters
  public static double convertInchesToCentimeters(double inches1) {
    double inches2cm = 2.54;
    return inches1 * inches2cm;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 
    //Input section: Take input from user
    System.out.println("Enter yards");
    double yards = sc.nextDouble();
    System.out.println("Enter  feet");
    double feet = sc.nextDouble();
    System.out.println("Enter  meter");
    double meters = sc.nextDouble();
    System.out.println("Enter inches");
    double inches = sc.nextDouble();
    System.out.println("Enter inches");
    double inches1 = sc.nextDouble();
       
    //Display section: Display the results
    System.out.println("The respected conversion of unit are : " +
                       "\n" + yards + " yards in feet is " + UnitConvertorTwo.convertYardsToFeet(yards) +
                       "\n" + feet + " feet in yards is " + UnitConvertorTwo.convertFeetToYards(feet) +
                       "\n" + meters + " meters in inches is " + UnitConvertorTwo.convertMetersToInches(meters)+
                       "\n" +inches + " inches in meters is " +UnitConvertorTwo.convertInchesToMeters(inches)+
                       "\n" +inches1 + " inches in cm is " +UnitConvertorTwo.convertInchesToCentimeters(inches1));

    sc.close();
  }
}