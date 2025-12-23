import java.util.Scanner;

public class StringLengthWithoutLengthMethod {
  // Method to find string length without using length()
  public static int findLength(String text) {
    int count = 0;

    try {
      while (true) {
        text.charAt(count);
        count++;
      }
    } catch (StringIndexOutOfBoundsException e) {
      // Exception occurs when index exceeds string length
    }

    return count;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section: take the user inputs
    System.out.print("Enter the string: ");
    String text = sc.next();


    int customLength = findLength(text);
    int builtInLength = text.length();

    // Display section: Display the results
    System.out.println("Length using custom method : " + customLength);
    System.out.println("Length using built-in method: " + builtInLength);

    sc.close();
  }
}
