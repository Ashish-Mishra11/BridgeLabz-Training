// Create QuotientAndRemainder class to compute quotient and remainder

import java.util.Scanner;
public class QuotientAndRemainder
{

  // Method section: create method to find quotient and remainder
  public static int[] findRemainderAndQuotient(int number, int divisor) {
    // Logic section: Calculate the quotient and remainder
    int answer[] = new int[2];
    answer[0] = number / divisor;
    answer[1] = number % divisor;
    return answer;
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    // Input section: Create variables number and divisor to store the values given by users
    System.out.print("Enter number: ");
    int number = sc.nextInt();
    System.out.print("Enter divisor: ");
    int divisor = sc.nextInt();

    // Display section: Display the results
    int answer[] = findRemainderAndQuotient(number, divisor);
    System.out.println("The Quotient is " + answer[0] +
                       " and Reminder is " + answer[1] +
                       " of two number " + number +
                       " and " + divisor);

    sc.close();
  }
}
