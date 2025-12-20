// Create StudentVoting class to determine whether the student can vote based on their ages

import java.util.Scanner;
public class StudentVoting {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input and declaration section: create a array ages of 10 integer elements and take user inputs  
    System.out.println("Enter the 10 ages of students: ");
    int []ages = new int[10];
    for(int i = 0; i < ages.length; i++) {
      System.out.println("Enter the age of students: ");
      ages[i] = sc.nextInt();
    }

    // Logic section: check if age is a negative number and print for validity of voting
     // Display results
    for(int i = 0; i < ages.length; i++) {
      if(ages[i] > 0) {
        if(ages[i] >= 18) {
          System.out.println("The student with the age " + ages[i] + " can vote");
        } else {
          System.out.println("The student with the age " + ages[i] + " cannot vote");
        }
      } else {
        System.out.println("an invalid age");
      }

    }


    sc.close();
  }
}