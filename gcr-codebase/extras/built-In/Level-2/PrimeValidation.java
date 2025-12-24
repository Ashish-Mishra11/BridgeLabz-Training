import java.util.Scanner;

public class PrimeValidation {

  // Method to check if a number is prime
  public static boolean isPrime(int number) {
    if (number <= 1) {
      return false; 
    }
    for (int i = 2; i * i <= number; i++) {
      if (number % i == 0) {
        return false; 
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // Input section: take the user inputs
    System.out.println("Enter the number: ");
    int num = sc.nextInt();
 
    // Display section: display the results
    if (isPrime(num)) {
      System.out.println(num + " is a prime number.");
    } else {
      System.out.println(num + " is not a prime number.");
    }
  }
}
