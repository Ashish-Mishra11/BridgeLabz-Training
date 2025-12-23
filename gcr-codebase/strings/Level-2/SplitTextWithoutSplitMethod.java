import java.util.Scanner;

public class SplitTextWithoutSplitMethod {

  //Method section: create the necessary methods
  // Method to find length of string without using length()
  public static int findLength(String text) {
    int count = 0;

    try {
      while (true) {
        text.charAt(count);
        count++;
      }
    } catch (StringIndexOutOfBoundsException e) {
      // stop counting
    }
    return count;
  }
  // Method to split text into words using charAt()
  public static String[] splitText(String text) {
    int length = findLength(text);
    int wordCount = 0;

    // Count words
    for (int i = 0; i < length; i++) {
      if (text.charAt(i) == ' ') {
        wordCount++;
      }
    }
    wordCount++; // last word
    // Store space indexes
    int[] spaceIndex = new int[wordCount - 1];
    int index = 0;

    for (int i = 0; i < length; i++) {
      if (text.charAt(i) == ' ') {
        spaceIndex[index++] = i;
      }
    }
    // Extract words
    String[] words = new String[wordCount];
    int start = 0;

    for (int i = 0; i < spaceIndex.length; i++) {
      words[i] = "";

      for (int j = start; j < spaceIndex[i]; j++) {
        words[i] += text.charAt(j);
      }
      start = spaceIndex[i] + 1;
    }
    // Last word
    words[wordCount - 1] = "";
    for (int i = start; i < length; i++) {
      words[wordCount - 1] += text.charAt(i);
    }

    return words;
  }
  // Method to compare two String arrays
  public static boolean compareArrays(String[] a, String[] b) {
    if (a.length != b.length) {
      return false;
    }

    for (int i = 0; i < a.length; i++) {
      if (!a[i].equals(b[i])) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section: take the user inputs
    System.out.println("Enter the complete text:");
    String text = sc.nextLine();

    // User-defined split
    String[] customWords = splitText(text);

    // Built-in split
    String[] builtInWords = text.split(" ");

    // Compare results
    boolean result = compareArrays(customWords, builtInWords);

    // Display section: Display the results
    System.out.println("Both results are same? " + result);

    sc.close();
  }
}
