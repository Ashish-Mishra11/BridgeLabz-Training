import java.util.Scanner;

public class PalindromeValidation {

  // Method section: 
  //Iterative comparison from start and end
  public static boolean isPalindromeIterative(String text) {
    int start = 0;
    int end = text.length() - 1;

    while (start < end) {
      if (text.charAt(start) != text.charAt(end)) {
        return false;
      }
      start++;
      end--;
    }
    return true;
  }
  //Recursive palindrome check
  public static boolean isPalindromeRecursive(String text, int start, int end) {
    if (start >= end) {
      return true;
    }

    if (text.charAt(start) != text.charAt(end)) {
      return false;
    }

    return isPalindromeRecursive(text, start + 1, end - 1);
  }
  // Reverse string using charAt()
  public static char[] reverseString(String text) {
    char[] reverse = new char[text.length()];
    int index = 0;

    for (int i = text.length() - 1; i >= 0; i--) {
      reverse[index] = text.charAt(i);
      index++;
    }
    return reverse;
  }
  // Character array comparison
  public static boolean isPalindromeUsingArrays(String text) {
    char[] original = text.toCharArray();
    char[] reverse = reverseString(text);

    for (int i = 0; i < original.length; i++) {
      if (original[i] != reverse[i]) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section:take the user inputs
    System.out.print("Enter the text: ");
    String text = sc.nextLine();

    // Method calling
    boolean result1 = isPalindromeIterative(text);
    boolean result2 = isPalindromeRecursive(text, 0, text.length() - 1);
    boolean result3 = isPalindromeUsingArrays(text);

    // Display section: Display the results
    System.out.println("\nPalindrome Check Results:");
    System.out.println("--------------------------");
    System.out.println("Using Iterative Logic  : " + result1);
    System.out.println("Using Recursive Logic  : " + result2);
    System.out.println("Using Array Comparison : " + result3);

    sc.close();
  }
}
