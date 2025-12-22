// Create NumberOfHandshakes class to find the maximum number of handshakes among students

import java.util.Scanner;
public class NumberOfHandshakes {

  // Method section: create method to calculate the number of handshakes
  public static int calculateHandshakes(int numberOfStudents) {
    int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
    return handshakes;
  }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    // Input section: take user input for numberOfStudents
    System.out.println("Enter numberOfStudents: ");
    int numberOfStudents = sc.nextInt();
    
    // Display section: Display the handshakes calculated
    int numberHandshakes = calculateHandshakes( numberOfStudents);
    System.out.println("The number of possible handshakes are: " + numberHandshakes);
    

    sc.close();
  }
}