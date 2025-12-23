import java.util.Scanner;

public class ComparisonOfLowerCase {
   
  // Method section: method to create custom lower case builder
  public static String toLowerCaseCustom(String text) {
    String result = "";

    for (int i = 0; i < text.length(); i++) {
      char ch = text.charAt(i);

      if (ch >= 'A' && ch <= 'Z') {
        ch = (char)(ch + 32);
      }
      result += ch;
    }
    return result;
  }
  // Methods to compare the results
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

    // Input section: take the user inputs
    System.out.print("Enter text: ");
    String text = sc.nextLine();

    // Method calls
    String custom = toLowerCaseCustom(text);
    String builtIn = text.toLowerCase();

    // Display section: Display the results
    System.out.println("custom output: " + custom);
    System.out.println("builtIn output: " + builtIn);
    System.out.println("Result same? " + compareStrings(custom, builtIn));

    sc.close();
  }
}
