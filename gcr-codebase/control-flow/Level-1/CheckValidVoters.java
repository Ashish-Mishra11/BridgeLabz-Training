// Writing a java code to check whether a person can vote
// Create CheckValidVoters class to check whether a person can vote

import java.util.Scanner;
public class CheckValidVoters {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    // Input section: Create variable age to store the value given by user 
    System.out.print("Enter the age: ");
    int age = sc.nextInt();

    // Logic section: Check whether a person can vote using conditional statements
    if(age >= 18) {
      System.out.println("The person's age is " + age + " and can vote.");// Display a message whether a person can vote
    } else {
      System.out.println("The person's age is " + age + " and cannot vote.");//Display a message whether a person can vote
    }

    sc.close();
  }
}