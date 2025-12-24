import java.util.Scanner;

public class GenerateFibonacci {

  // Method to generate and print Fibonacci sequence
  public static void generateFibonacci(int terms) {
    int first = 0, second = 1;

    System.out.print("Fibonacci sequence: ");

    for (int i = 1; i <= terms; i++) {
      System.out.print(first + " ");

      int next = first + second;
      first = second;
      second = next;
    }
  }

  // Input section: Method to get user input
  public static int getInput(String prompt) {
    Scanner sc = new Scanner(System.in);
    System.out.print(prompt);
    return sc.nextInt();
  }

  public static void main(String[] args) {
    int n = getInput("Enter the number of Fibonacci terms to generate: ");
    
    if (n <= 0) {
      System.out.println("Please enter a positive number.");
    } else {
      generateFibonacci(n);
    }
  }
}
