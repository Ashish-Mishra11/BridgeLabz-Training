// Create MeanHeightOfPlayers class to compute mean height of players of football team

import java.util.Scanner;
public class MeanHeightOfPlayers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input and declaration section: Create array heights and store values given by user
    double[] heights = new double[11];
    double sum = 0.0;
    for (int i = 0; i < heights.length; i++) {
      System.out.print("Enter height of player " + (i + 1) + ": ");
      heights[i] = sc.nextDouble();
    }


    // Logic section: Find the sum of heights to calculate mean
    for (int i = 0; i < heights.length; i++) {
      sum = sum + heights[i];
    }
    double meanHeight = sum / heights.length;// Calculate mean height


    // Display section: Display mean height of the team
    System.out.println("Mean height of the football team: " + meanHeight);

    sc.close();
  }
}
