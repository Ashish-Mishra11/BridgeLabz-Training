/*19. Bus Route Distance Tracker 
Each stop adds distance.
 Ask if the passenger wants to get off at a stop.
 Use a while-loop with a total distance tracker.
 Exit on user confirmation.*/

import java.util.Scanner;

public class BusRouteDistanceTracker {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("=============================================");
    System.out.println("Welcome to the Bus Route Distance Tracker!");
    System.out.println("==============================================");
    System.out.println("The bus will stop at various points, adding distance along the way.\n");

    double totalDistance = 0.0;
    int stopNumber = 1;
    double distanceBetweenStops = 5.0;

    while (true) {
      totalDistance += distanceBetweenStops;

      System.out.printf("Stop %d reached!%n", stopNumber);
      System.out.printf("Total distance traveled so far: %.1f km%n%n", totalDistance);

      // Ask if passenger wants to get off
      // Input section: Take the input from user
      System.out.print("Do you want to get off at this stop? (yes/no): ");
      String response = sc.nextLine().trim().toLowerCase();

      // Display section: display the results
      if (response.equals("yes") || response.equals("y")) {
        System.out.println("=======================================================");
        System.out.println("\nThank you for riding with us!");
        System.out.printf("You got off at Stop %d.%n", stopNumber);
        System.out.printf("Final total distance traveled: %.1f km%n", totalDistance);
        System.out.println("=======================================================");
        break;
      } else {
        System.out.println("Continuing the journey...\n");
        stopNumber++;
      } 
    }

    sc.close();
  }
}
