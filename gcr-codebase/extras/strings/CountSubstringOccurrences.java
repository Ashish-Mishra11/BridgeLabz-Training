import java.util.Scanner;

public class CountSubstringOccurrences {

  // Method to count substring occurrences
  public static int countOccurrences(String str, String sub) {
    int count = 0;
    int index = 0;

    while ((index = str.indexOf(sub, index)) != -1) {
      count++;
      index = index + sub.length();
    }

    return count;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section: take the user inputs
    System.out.println("Enter the string: ");
    String str = sc.nextLine();
    System.out.println("Enter the substring: ");
    String sub = sc.nextLine();

    // Method calling
    int result = countOccurrences(str, sub);

    // Display result
    System.out.println("Number of occurrences: " + result);

    sc.close();
  }
}
