import java.util.Scanner;

public class ComparisonOfUpperCase {

  // Method section: create the necessary methods
  // Method to convert text to uppercase using charAt()
  public static String convertToUpperCase(String text) {
    String result = "";

    for (int i = 0; i < text.length(); i++) {
      char ch = text.charAt(i);

      if (ch >= 'a' && ch <= 'z') {
        ch = (char)(ch - 32);
      }
      result = result + ch;
    }
    return result;
  }
  // Method to compare two strings using charAt()
  public static boolean compareStrings(String s1, String s2) {
    if (s1.length() != s2.length()) {
      return false;
    }

    for (int i = 0; i < s1.length(); i++) {
      if (s1.charAt(i) != s2.charAt(i)) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section: take the inputs from user
    System.out.println("Enter the complete text:");
    String text = sc.nextLine();


    String customUpper = convertToUpperCase(text);
    String builtInUpper = text.toUpperCase();

    // method call to compare
    boolean result = compareStrings(customUpper, builtInUpper);

    // Display section: Display the results
    System.out.println("Custom Uppercase Text : " + customUpper);
    System.out.println("Built-in Uppercase Text: " + builtInUpper);
    System.out.println("Both results are same? " + result);

    sc.close();
  }
}
