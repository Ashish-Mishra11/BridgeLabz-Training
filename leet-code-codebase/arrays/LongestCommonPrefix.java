import java.util.Arrays;
import java.util.Scanner;

class LongestCommonPrefix {

  // Method to find longest common prefix
  public static String longestCommonPrefix(String[] strs) {
    Arrays.sort(strs);
    int n = strs.length;
    String s = strs[0];
    int r = 0;

    for (int i = 1; i < n; i++) {
      while (r < strs[i].length() && r < s.length()) {
        if (s.charAt(r) != strs[i].charAt(r)) {
          s = s.substring(0, r);
          break;
        }
        r++;
      }
      r = 0;
    }
    return s;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section: take the user inputs
    System.out.print("Enter number of strings: ");
    int n = sc.nextInt();
    sc.nextLine(); // consume newline

    String[] strs = new String[n];
    System.out.println("Enter strings:");
    for (int i = 0; i < n; i++) {
      strs[i] = sc.nextLine();
    }

    // Method calling
    String result = longestCommonPrefix(strs);

    // Display the results
    System.out.println("Longest Common Prefix: " + result);

    sc.close();
  }
}
