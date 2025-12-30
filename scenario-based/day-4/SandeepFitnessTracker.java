/*13. Sandeep’s Fitness Challenge Tracker 🏋️
♂Each day Sandeep completes a number of push-ups.
● Store counts for a week.
● Use for-each to calculate total and average.
● Use continue to skip rest days.*/

import java.util.Scanner;

public class SandeepFitnessTracker {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section: take the inputs from the user
    int []pushUps = new int[7];
    for(int i = 0; i < 7; i++) {
      System.out.println("Enter the number of pushUps in " + (i+1) + " days");
      pushUps[i] = sc.nextInt();
    }

    // Logic to calculate the average and total pushups
    int totalSum = 0;
    int average = 0;
    int restDays = 0;
    for(int each : pushUps) {
      if(each == 0) {
        restDays ++;
        continue;
      }
      totalSum += each;
    }
   
    average = (totalSum/(7-restDays));

    // Display section: display the results
    System.out.println("==========================================");
    System.out.println("                 Your status              ");
    System.out.println("==========================================");
    System.out.printf("  %s %-15d%n","average number of pushups are: " , (totalSum/(7-restDays)));
    System.out.printf("  %s %-15d%n","Total pushUps are: " , totalSum);
    sc.close();
  }
}