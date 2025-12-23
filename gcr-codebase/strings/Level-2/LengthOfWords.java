import java.util.Scanner;

public class LengthOfWords {

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
    wordCount++; 

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
  // Method to return 2D array of word and its length
  public static String[][] wordsWithLengths(String[] words) {
    String[][] result = new String[words.length][2];
    for (int i = 0; i < words.length; i++) {
      result[i][0] = words[i];
      result[i][1] = String.valueOf(findLength(words[i]));
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section: take the user inputs
    System.out.println("Enter the complete text:");
    String text = sc.nextLine();

    // Split text into words and find word length also
    String[] words = splitText(text);
    String[][] table = wordsWithLengths(words);

    // Display section: Display the results
    System.out.println("\nWord\tLength");
    System.out.println("----------------");
    for (int i = 0; i < table.length; i++) {
      String word = table[i][0];
      int length = Integer.parseInt(table[i][1]);
      System.out.println(word + "\t" + length);
    }

    sc.close();
  }
}
