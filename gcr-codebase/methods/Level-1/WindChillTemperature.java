// Create WindChillTemperature class to calculate the wind chill temperature given the temperature and wind speed

import java.util.Scanner;
public class WindChillTemperature {

  // Method section: create method to calculate wind chill temperature 
  public static double calculateWindChill(double temperature, double windSpeed) {
    double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    return windChill;
  }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    // Input section: take user input for temperature and windspeed
    System.out.println("Enter temperature: ");
    double temperature = sc.nextDouble();
    System.out.println("Enter wind speed: ");
    double windSpeed = sc.nextDouble();

    // Display section: Display the wind chill temperature calculated
    double answer = calculateWindChill(temperature, windSpeed);
    System.out.println("The wind chill temperature is: " + answer);
    

    sc.close();
  }
}