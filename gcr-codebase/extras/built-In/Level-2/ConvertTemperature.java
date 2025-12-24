import java.util.Scanner;

public class ConvertTemperature {

  // Method to convert Celsius to Fahrenheit
  public static double celsiusToFahrenheit(double celsius) {
    return (celsius * 9 / 5) + 32;
  }

  // Method to convert Fahrenheit to Celsius
  public static double fahrenheitToCelsius(double fahrenheit) {
    return (fahrenheit - 32) * 5 / 9;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Input section: take the user inputs
    System.out.println("Temperature Converter");
    System.out.println("1. Celsius to Fahrenheit");
    System.out.println("2. Fahrenheit to Celsius");
    System.out.print("Enter your choice (1 or 2): ");
    int choice = scanner.nextInt();

    // Display section: Display the results
    if (choice == 1) {
      System.out.print("Enter temperature in Celsius: ");
      double celsius = scanner.nextDouble();
      double fahrenheit = celsiusToFahrenheit(celsius);
      System.out.println(celsius + "°C = " + fahrenheit + "°F");
    } 
    else if (choice == 2) {
      System.out.print("Enter temperature in Fahrenheit: ");
      double fahrenheit = scanner.nextDouble();
      double celsius = fahrenheitToCelsius(fahrenheit);
      System.out.println(fahrenheit + "°F = " + celsius + "°C");
    } 
    else {
      System.out.println("Invalid choice!");
    }

    scanner.close();
  }
}
