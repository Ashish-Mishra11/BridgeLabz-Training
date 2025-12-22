import java.util.Scanner;
public class UnitConvertorOne {
    
  // Method section: Create the static methods
  //Method to convert km to miles
  public static double convertKmToMiles(double km) {
    double km2miles = 0.621371;
    return km * km2miles;
  }
  //Method to convert Miles to km
  public static double convertMilesToKm(double miles) {
    double miles2km = 1.60934;
    return miles * miles2km;
  } 
  //Method to convert meters to feet
  public static double convertMeterToFeet(double meters) {
    double meters2feet = 3.28084;
    return meters * meters2feet;
  }
  //Method to convert feet to meters
  public static double convertFeetToMeters(double feet) {
    double feet2meters = 0.3048;
    return feet * feet2meters;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 
    //Input section: Take input from user
    System.out.println("Enter Km");
    double km = sc.nextDouble();
    System.out.println("Enter  miles");
    double miles = sc.nextDouble();
    System.out.println("Enter  meter");
    double meter = sc.nextDouble();
    System.out.println("Enter feet");
    double feet = sc.nextDouble();
       
    //Display section: Display the results
    System.out.println("The respected conversion of unit are : " +
                       "\n" + km + " km in miles is " + UnitConvertorOne.convertKmToMiles(km) +
                       "\n" + miles + " miles in km is " + UnitConvertorOne.convertMilesToKm(miles) +
                       "\n" + meter + " meter in feet is " + UnitConvertorOne.convertMeterToFeet(meter)+
                       "\n" +feet + " feet in meter is " +UnitConvertorOne.convertFeetToMeters(feet));

    sc.close();
  }
}