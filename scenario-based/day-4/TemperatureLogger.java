/*11. Temperature Logger 🌡️
Record temperatures over 7 days.
● Use array and for-loop.
● Find average and max temperature.
● Use if for comparisons. Maintain readable naming and modular code blocks.*/

import java.util.Scanner;

public class TemperatureLogger {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double max = Integer.MIN_VALUE;
    double totalSum = 0.0;
    double []temperature = new double[7];
    for(int i = 0; i < 7; i++) {
      // Input section: take the temperature from users
      System.out.println("Enter the temperature "+(i+1)+" :");

      // Logic to calculate the average and max temperature
      temperature[i] = sc.nextDouble();
      if(temperature[i] > max) {
        max = temperature[i];
      }
      totalSum += temperature[i];
    }
    double average = totalSum / 7;

    // Display section: display the results
    System.out.println("=================================================");
    System.out.printf("    %s%n", "Welcome to temperature logger");
    System.out.println("=================================================\n");
    System.out.printf("    %s%f%n","The average temperature is: " , average);
    System.out.printf("    %s%f%n","The max temperature is: " , max);

    sc.close();
  }
}