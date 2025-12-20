// Create GradeCalculator class using normal arrays to calculate the grade of students

import java.util.Scanner;
public class GradeCalculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section: Take number of students
    System.out.print("Enter number of students: ");
    int numberOfStudents = sc.nextInt();

    // Declaration section: Declare array to be used in problem
    double[] physics = new double[numberOfStudents];
    double[] chemistry = new double[numberOfStudents];
    double[] maths = new double[numberOfStudents];
    double[] percentage = new double[numberOfStudents];
    char[] grade = new char[numberOfStudents];

    // Input section: Take marks with validation
    for (int i = 0; i < numberOfStudents; i++) {
      System.out.println("\nEnter marks for Student " + (i + 1));
      System.out.print("Physics: ");
      physics[i] = sc.nextDouble();
      System.out.print("Chemistry: ");
      chemistry[i] = sc.nextDouble();
      System.out.print("Maths: ");
      maths[i] = sc.nextDouble();
      // Validation: No negative marks
      if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
        System.out.println("Invalid marks. Please enter positive values.");
        i--; // Decrement index to re-enter marks
      }
    }

    // Logic section: Calculate percentage and grade
    for (int i = 0; i < numberOfStudents; i++) {
      percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3;
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

    // Display section: Display the results
    System.out.println("\nStudent Result Details:");
    for (int i = 0; i < numberOfStudents; i++) {
      System.out.println(
        "Student " + (i + 1) +
        " \n Physics: " + physics[i] +
        " \n Chemistry: " + chemistry[i] +
        " \n Maths: " + maths[i] +
        " \n Percentage: " + percentage[i] +
        "% \n Grade: " + grade[i]
      );
    }

    sc.close();
  }
}
