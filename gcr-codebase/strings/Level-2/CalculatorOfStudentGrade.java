import java.util.Random;
import java.util.Scanner;

public class CalculatorOfStudentGrade {

  //Method section: create the necessary methods
  // Method to generate random 2-digit PCM scores for students
  public static int[][] generatePCMScores(int students) {
    Random rd = new Random();
    int[][] scores = new int[students][3];
    for (int i = 0; i < students; i++) {
      scores[i][0] = rd.nextInt(51) + 50; // Physics
      scores[i][1] = rd.nextInt(51) + 50; // Chemistry
      scores[i][2] = rd.nextInt(51) + 50; // Maths
    }
    return scores;
  }
  // Method to calculate total, average, percentage
  public static double[][] calculateResults(int[][] scores) {
    double[][] result = new double[scores.length][3];

    for (int i = 0; i < scores.length; i++) {
      int total = scores[i][0] + scores[i][1] + scores[i][2];
      double average = total / 3.0;
      double percentage = (total / 300.0) * 100;

      result[i][0] = total;
      result[i][1] = Math.round(average * 100.0) / 100.0;
      result[i][2] = Math.round(percentage * 100.0) / 100.0;
    }
    return result;
  }
  // Method to calculate grade based on percentage
  public static String[] calculateGrades(double[][] results) {
    String[] grades = new String[results.length];

    for (int i = 0; i < results.length; i++) {
      double percent = results[i][2];

      if (percent >= 80) {
        grades[i] = "A";
      } else if (percent >= 70) {
        grades[i] = "B";
      } else if (percent >= 60) {
        grades[i] = "C";
      } else if (percent >= 50) {
        grades[i] = "D";
      } else if (percent >= 40) {
        grades[i] = "E";
      } else {
        grades[i] = "R";
      }
    }
    return grades;
  }
  // Method to display scorecard
  public static void displayScoreCard(int[][] scores, double[][] results, String[] grades) {
    System.out.println("\nScore Card");
    System.out.println("Student\tPhy\tChem\tMath\tTotal\tAverage\t%\tGrade");
    System.out.println("----------------------------------------------------------------");

    for (int i = 0; i < scores.length; i++) {
      System.out.println((i + 1) + "\t" +
                         scores[i][0] + "\t" +
                         scores[i][1] + "\t" +
                         scores[i][2] + "\t" +
                         (int)results[i][0] + "\t" +
                         results[i][1] + "\t" +
                         results[i][2] + "\t" +
                         grades[i]);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section: take the user inputs
    System.out.print("Enter number of students: ");
    int students = sc.nextInt();

    // Method calling
    int[][] scores = generatePCMScores(students);
    double[][] results = calculateResults(scores);
    String[] grades = calculateGrades(results);

    // Display section: display the results
    displayScoreCard(scores, results, grades);

    sc.close();
  }
}
