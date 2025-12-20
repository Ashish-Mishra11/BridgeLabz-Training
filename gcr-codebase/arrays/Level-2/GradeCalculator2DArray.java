// Create GradeCalculator2DArray class to calculate percentage and grade of the students

import java.util.Scanner;
public class GradeCalculator2DArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section: Create variable number of students to store value given by user
    System.out.print("Enter number of students: ");
    int numberOfStudents = sc.nextInt();

    // Declaration section: Declare the necessary arrays
    double[][] marks = new double[numberOfStudents][3];
    double[] percentage = new double[numberOfStudents];
    char[] grade = new char[numberOfStudents];

    // Input section: Take marks as input
    for (int i = 0; i < numberOfStudents; i++) {
      System.out.println("\nEnter marks for Student " + (i + 1));
      System.out.print("Physics: ");
      marks[i][0] = sc.nextDouble();
      System.out.print("Chemistry: ");
      marks[i][1] = sc.nextDouble();
      System.out.print("Maths: ");
      marks[i][2] = sc.nextDouble();
      // Validation: Marks should not be negative
      if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
        System.out.println("Invalid marks. Please enter positive values.");
        i--; // Decrement index to re-enter marks
      }
    }

    // Logic section: Calculate percentage and grade
    for (int i = 0; i < numberOfStudents; i++) {
      double total = marks[i][0] + marks[i][1] + marks[i][2];
      percentage[i] = total / 3;
      if (percentage[i] >= 80) {
        grade[i] = 'A';
      } else if (percentage[i] >= 70) {
        grade[i] = 'B';
      } else if (percentage[i] >= 60) {
        grade[i] = 'C';
      } else if (percentage[i] >= 50) {
        grade[i] = 'D';
      } else if (percentage[i] >= 40) {
        grade[i] = 'E';
      } else {
        grade[i] = 'R';
      }
    }

    // Display section
    System.out.println("\nStudent Result Details:");
    for (int i = 0; i < numberOfStudents; i++) {
      System.out.println(
        "Student " + (i + 1) +
        " \n Physics: " + marks[i][0] +
        " \n Chemistry: " + marks[i][1] +
        " \n Maths: " + marks[i][2] +
        " \n Percentage: " + percentage[i] +
        "% \n Grade: " + grade[i]
      );
    }

    sc.close();
  }
}
