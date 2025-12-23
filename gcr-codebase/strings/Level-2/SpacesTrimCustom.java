import java.util.Scanner;

public class SpacesTrimCustom {

  // Method section: create the necessary methods
  // Method to find start and end index after trimming spaces
  public static int[] findTrimIndexes(String text) {
    int start = 0;
    int end = text.length() - 1;
    while (start <= end && text.charAt(start) == ' ') {
      start++;
    }
    while (end >= start && text.charAt(end) == ' ') {
      end--;
    }

    return new int[] { start, end };
  }
  // Method to create substring using charAt()
  public static String substringCustom(String text, int start, int end) {
    String result = "";

    for (int i = start; i <= end; i++) {
      result += text.charAt(i);
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

    // Input section: take the users inputs 
    System.out.println("Enter the text:");
    String text = sc.nextLine();

    // Method calling for User-defined trimming 
    int[] indexes = findTrimIndexes(text);
    String customTrimmed = substringCustom(text, indexes[0], indexes[1]);

    // Method calling for Built-in trim
    String builtInTrimmed = text.trim();

    // Method calling for Comparison
    boolean result = compareStrings(customTrimmed, builtInTrimmed);

    // Display section: Display the results
    System.out.println("\nCustom Trimmed Text: [" + customTrimmed + "]");
    System.out.println("Built-in Trimmed Text: [" + builtInTrimmed + "]");
    System.out.println("Are both results same? " + result);

    sc.close();
  }
}
