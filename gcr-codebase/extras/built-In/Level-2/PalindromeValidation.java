import java.util.Scanner;

public class PalindromeValidation {

  // Method to get input from user
  public static String getInput(String prompt) {
    Scanner sc = new Scanner(System.in);
    System.out.print(prompt);
    return sc.nextLine();
  }

  // Method to check if a string is a palindrome
  public static boolean isPalindrome(String str) {
    // Normalize the string: remove spaces and convert to lowercase
    str = str.replaceAll("\\s+", "").toLowerCase();
    int left = 0;
    int right = str.length() - 1;

    while (left < right) {
      if (str.charAt(left) != str.charAt(right)) {
        return false;
      }
      left++;
      right--;
    }

    return true;
  }

  // Method to display the result
  public static void displayResult(String str, boolean result) {
    if (result) {
      System.out.println("\"" + str + "\" is a palindrome.");
    } else {
      System.out.println("\"" + str + "\" is not a palindrome.");
    }
  }

  public static void main(String[] args) {
    
    // Input section: take the user inputs
    String input = getInput("Enter a string to check: ");

    // Method calling
    boolean result = isPalindrome(input);

    // Display results
    displayResult(input, result);
  }
}
