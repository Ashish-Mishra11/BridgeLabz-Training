// Create DistributionOfChocolate class to divide chocolates among children of section

import java.util.Scanner;
public class DistributionOfChocolate {

  // Method section: create Method to find quotient and remainder
  public static int[] findRemainderAndQuotient(int number, int divisor) {
    int[] answer = new int[2];
    answer[0] = number / divisor; 
    answer[1] = number % divisor;
    return answer;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section: take inputs from user
    System.out.print("Enter number of chocolates: ");
    int numberOfChocolates = sc.nextInt();
    System.out.print("Enter number of children: ");
    int numberOfChildren = sc.nextInt();

    // Display section: Display the results
    int[] answer = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
    System.out.println("Each child gets: " + answer[0] + " chocolate(s)");
    System.out.println("Remaining chocolates: " + answer[1]);

    sc.close();
  }

  
}
