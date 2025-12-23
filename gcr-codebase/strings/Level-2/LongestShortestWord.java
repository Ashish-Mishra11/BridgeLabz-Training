import java.util.Scanner;

public class LongestShortestWord {

  // Method section: create the necessary methods 
  // Method to find length of string without using length()
  public static int findLength(String text) {
    int count = 0;
    try {
      while (true) {
        text.charAt(count);
        count++;
      }
    } catch (StringIndexOutOfBoundsException e) {
      // end of string
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
  // Method to create 2D array [word, length]
  public static String[][] wordsWithLengths(String[] words) {
    String[][] result = new String[words.length][2];
    for (int i = 0; i < words.length; i++) {
      result[i][0] = words[i];
      result[i][1] = String.valueOf(findLength(words[i]));
    }
    return result;
  }
  // Returns array of length 2: [index of shortest, index of longest]
  public static int[] findShortestLongest(String[][] wordsWithLengths) {
    int shortestIndex = 0;
    int longestIndex = 0;
    int minLen = Integer.parseInt(wordsWithLengths[0][1]);
    int maxLen = Integer.parseInt(wordsWithLengths[0][1]);

    for (int i = 1; i < wordsWithLengths.length; i++) {
      int len = Integer.parseInt(wordsWithLengths[i][1]);
      if (len < minLen) {
        minLen = len;
        shortestIndex = i;
      }
      if (len > maxLen) {
        maxLen = len;
        longestIndex = i;
      }
    }
    return new int[]{shortestIndex, longestIndex};
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section: take the user inputs
    System.out.println("Enter the complete text:");
    String text = sc.nextLine();

    // Split text into words
    String[] words = splitText(text);

    // Get words with lengths
    String[][] table = wordsWithLengths(words);

    // Find shortest and longest word
    int[] indices = findShortestLongest(table);
    int shortestIndex = indices[0];
    int longestIndex = indices[1];

    // Display results: Display the results 
    System.out.println("\nWord\tLength");
    System.out.println("----------------");
    for (int i = 0; i < table.length; i++) {
      System.out.println(table[i][0] + "\t" + table[i][1]);
    }

    System.out.println("\nShortest word: " + table[shortestIndex][0] + " (Length: " + table[shortestIndex][1] + ")");
    System.out.println("Longest word : " + table[longestIndex][0] + " (Length: " + table[longestIndex][1] + ")");

    sc.close();
  }
}
