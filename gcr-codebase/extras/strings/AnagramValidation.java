import java.util.Scanner;

public class AnagramValidation {

  // Method to check if two strings are anagrams
  public static boolean isAnagram(String s1, String s2) {
    if (s1.length() != s2.length()) {
      return false;
    }
    int[] freq1 = new int[256];
    int[] freq2 = new int[256];
    for (int i = 0; i < s1.length(); i++) {
      char ch1 = s1.charAt(i);
      char ch2 = s2.charAt(i);
      freq1[ch1]++;
      freq2[ch2]++;
    }
    for (int i = 0; i < 256; i++) {
      if (freq1[i] != freq2[i]) {
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section: take the user inputs
    System.out.println("Enter first string: ");
    String s1 = sc.nextLine();
    System.out.println("Enter second string: ");
    String s2 = sc.nextLine();

    // Method calling
    boolean result = isAnagram(s1, s2);

    // Display result: display the results
    if (result) {
      System.out.println("The strings are anagrams.");
    } else {
      System.out.println("The strings are not anagrams.");
    }

    sc.close();
  }
}
