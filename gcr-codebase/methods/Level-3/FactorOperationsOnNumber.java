import java.util.Scanner;

public class FactorOperationsOnNumber {

  // Method section: create the necessary methods
  // Method to find factors of a number and return as an array
  public static int[] findFactors(int number) {
    int count = 0;
    for (int i = 1; i <= number; i++) {
      if (number % i == 0) {
        count++;
      }
    }
    int[] factors = new int[count];
    int index = 0;
    for (int i = 1; i <= number; i++) {
      if (number % i == 0) {
        factors[index] = i;
        index++;
      }
    }
    return factors;
  }
  // Method to find the greatest factor using factors array
  public static int findGreatestFactor(int[] factors) {
    int greatest = Integer.MIN_VALUE;
    for (int factor : factors) {
      if (factor > greatest) {
        greatest = factor;
      }
    }
    return greatest;
  }
  // Method to find sum of factors
  public static int findSumOfFactors(int[] factors) {
    int sum = 0;
    for (int factor : factors) {
      sum += factor;
    }
    return sum;
  }
  // Method to find product of factors
  public static long findProductOfFactors(int[] factors) {
    long product = 1;
    for (int factor : factors) {
      product *= factor;
    }
    return product;
  }
  // Method to find product of cube of factors
  public static double findProductOfCubeOfFactors(int[] factors) {
    double product = 1;
    for (int factor : factors) {
      product *= Math.pow(factor, 3);
    }
    return product;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section: take the input from the users
    System.out.print("Enter a number: ");
    int number = sc.nextInt();

    int[] factors = findFactors(number);

    // Display section: Display the results
    System.out.print("Factors: ");
    for (int factor : factors) {
      System.out.print(factor + " ");
    }

    System.out.println("\nGreatest Factor: " + findGreatestFactor(factors));
    System.out.println("Sum of Factors: " + findSumOfFactors(factors));
    System.out.println("Product of Factors: " + findProductOfFactors(factors));
    System.out.println("Product of Cube of Factors: " + findProductOfCubeOfFactors(factors));

    sc.close();
  }
}
