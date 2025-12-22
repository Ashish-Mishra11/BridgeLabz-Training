import java.util.Scanner;

public class UnitConvertorThree {

  // Method section: create the static methods
  // Method to convert Fahrenheit to Celsius
  public static double convertFahrenheitToCelsius(double fahrenheit) {
    double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;
    return fahrenheit2celsius;
  }
  // Method to convert Celsius to Fahrenheit
  public static double convertCelsiusToFahrenheit(double celsius) {
    double celsius2fahrenheit = (celsius * 9 / 5) + 32;
    return celsius2fahrenheit;
  }
  // Method to convert pounds to kilograms
  public static double convertPoundsToKilograms(double pounds) {
    double pounds2kilograms = 0.453592;
    return pounds * pounds2kilograms;
  }
  // Method to convert kilograms to pounds
  public static double convertKilogramsToPounds(double kilograms) {
    double kilograms2pounds = 2.20462;
    return kilograms * kilograms2pounds;
  }
  // Method to convert gallons to liters
  public static double convertGallonsToLiters(double gallons) {
    double gallons2liters = 3.78541;
    return gallons * gallons2liters;
  }
  // Method to convert liters to gallons
  public static double convertLitersToGallons(double liters) {
    double liters2gallons = 0.264172;
    return liters * liters2gallons;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section: take the necessary inputs 
    System.out.print("Enter temperature in Fahrenheit: ");
    double fahrenheit = sc.nextDouble();
    System.out.print("Enter temperature in Celsius: ");
    double celsius = sc.nextDouble();
    System.out.print("Enter weight in pounds: ");
    double pounds = sc.nextDouble();
    System.out.print("Enter weight in kilograms: ");
    double kilograms = sc.nextDouble();
    System.out.print("Enter volume in gallons: ");
    double gallons = sc.nextDouble();
    System.out.print("Enter volume in liters: ");
    double liters = sc.nextDouble();

    // Display section: Display the results 
    System.out.println(fahrenheit + " Fahrenheit in Celsius = " +
                       UnitConvertorThree.convertFahrenheitToCelsius(fahrenheit));
    System.out.println(celsius + " Celsius in Fahrenheit = " +
                       UnitConvertorThree.convertCelsiusToFahrenheit(celsius));
    System.out.println(pounds + " Pounds in Kilograms = " +
                       UnitConvertorThree.convertPoundsToKilograms(pounds));
    System.out.println(kilograms + " Kilograms in Pounds = " +
                       UnitConvertorThree.convertKilogramsToPounds(kilograms));
    System.out.println(gallons + " Gallons in Liters = " +
                       UnitConvertorThree.convertGallonsToLiters(gallons));
    System.out.println(liters + " Liters in Gallons = " +
                       UnitConvertorThree.convertLitersToGallons(liters));

    sc.close();
  }
}
