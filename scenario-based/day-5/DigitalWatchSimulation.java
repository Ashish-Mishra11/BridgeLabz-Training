/*16. Digital Watch Simulation 
Simulate a 24-hour watch:
● Print hours and minutes in a nested for-loop.
● Use a break to stop at 13:00 manually (simulate power cut).
Core Java Scenario Based Problem Statements*/

import java.util.Scanner;

public class DigitalWatchSimulation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 
    // Input section
    System.out.println("===================================");
    System.out.println("          Digital watch            ");
    System.out.println("===================================");

    for(int i = 0; i < 24; i++) {
      if(i == 13){
        break;
      }
      // Display the results
      for(int q = 0; q < 60; q++) {
        System.out.printf("  %s%02d %s %s %02d%s%n","Time = ",i,"hrs",":",q," min");
      }
    }
    System.out.println("  Power cut at 13 hrs : 00 min");
    sc.close();
  }
}