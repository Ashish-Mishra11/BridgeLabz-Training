import java.util.Scanner;

public class StudentGradeUsingMethods {

  // Methods section: create the necessary methods
  // Method to generate random 2-digit PCM marks
  public static int[][] generatePCMMarks(int students) {
    int[][] pcm = new int[students][3];

    for (int i = 0; i < students; i++) {
      pcm[i][0] = (int)(Math.random() * 90) + 10; // Physics
      pcm[i][1] = (int)(Math.random() * 90) + 10; // Chemistry
      pcm[i][2] = (int)(Math.random() * 90) + 10; // Maths
    }
    return pcm;
  }
  // Method to calculate total, average and percentage
  public static double[][] calculateResult(int[][] pcm) {
    int students = pcm.length;
    double[][] result = new double[students][3]; // total, average, percentage

    for (int i = 0; i < students; i++) {
      int total = pcm[i][0] + pcm[i][1] + pcm[i][2];
      double average = total / 3.0;
      double percentage = (total / 300.0) * 100;

      average = Math.round(average * 100.0) / 100.0;
      percentage = Math.round(percentage * 100.0) / 100.0;

      result[i][0] = total;
      result[i][1] = average;
      result[i][2] = percentage;
    }
    return result;
  }
  // Method to find grade
  public static String findGrade(double percentage) {
    if (percentage >= 80)
      return "A";
    else if (percentage >= 70)
      return "B";
    else if (percentage >= 60)
      return "C";
    else if (percentage >= 50)
      return "D";
    else if (percentage >= 40)
      return "E";
    else
      return "R";
  }
  // Method to display scorecard
  public static void displayScoreCard(int[][] pcm, double[][] result) {
    System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");

    for (int i = 0; i < pcm.length; i++) {
      System.out.println(
        (i + 1) + "\t" +
        pcm[i][0] + "\t" +
        pcm[i][1] + "\t" +
        pcm[i][2] + "\t" +
        result[i][0] + "\t" +
        result[i][1] + "\t" +
        result[i][2] + "\t" +
        findGrade(result[i][2])
      );
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section: take the user inputs for number of students 
    System.out.print("Enter number of students: ");
    int students = sc.nextInt();
    
    // method call
    int[][] pcm = generatePCMMarks(students);
    double[][] result = calculateResult(pcm);
 
    // Display section: Display the results
    displayScoreCard(pcm, result);

    sc.close();
  }
}
