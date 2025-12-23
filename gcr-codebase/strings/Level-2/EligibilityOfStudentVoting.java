import java.util.Scanner;
import java.util.Random;

public class EligibilityOfStudentVoting {

  // Method section: create the necessary methods
  // Method to generate random 2-digit ages for n students
  public static int[] generateAges(int n) {
    Random rd = new Random();
    int[] ages = new int[n];

    for (int i = 0; i < n; i++) {
      ages[i] = rd.nextInt(90) + 10;
    }
    return ages;
  }
  // Method to check voting eligibility
  // Returns 2D array: Age and Can Vote
  public static String[][] checkVotingEligibility(int[] ages) {
    String[][] result = new String[ages.length][2];

    for (int i = 0; i < ages.length; i++) {
      result[i][0] = String.valueOf(ages[i]);

      if (ages[i] < 0) {
        result[i][1] = "false";
      } else if (ages[i] >= 18) {
        result[i][1] = "true";
      } else {
        result[i][1] = "false";
      }
    }
    return result;
  }
  // Method to display 2D array in tabular format
  public static void displayTable(String[][] data) {
    System.out.println("\nAge\tCan Vote");
    System.out.println("----------------");

    for (int i = 0; i < data.length; i++) {
      System.out.println(data[i][0] + "\t" + data[i][1]);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section: take the user inputs
    System.out.print("Enter number of students: ");
    int n = sc.nextInt();

    // Method call for Generate ages
    int[] ages = generateAges(n);

    // method call for Check voting eligibility
    String[][] result = checkVotingEligibility(ages);

    // Display result: Display the results
    displayTable(result);

    sc.close();
  }
}
