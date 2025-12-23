import java.util.Scanner;

public class FrequencyOfCharacter {

  // Method section: create the necessary methods
  // Method to find character frequencies using charAt()
  public static String[][] findFrequencies(String text) {
    int[] freq = new int[256];
    // Count frequency of each character
    for (int i = 0; i < text.length(); i++) {
      char ch = text.charAt(i);
      freq[ch]++;
    }
    // Count unique characters
    boolean[] added = new boolean[256];
    int uniqueCount = 0;
    for (int i = 0; i < text.length(); i++) {
      char ch = text.charAt(i);
      if (!added[ch]) {
        uniqueCount++;
        added[ch] = true;
      }
    }
    // Create result array
    String[][] result = new String[uniqueCount][2];
    int index = 0;
    // Store characters and their frequencies
    for (int i = 0; i < text.length(); i++) {
      char ch = text.charAt(i);
      if (added[ch]) {
        result[index][0] = String.valueOf(ch);
        result[index][1] = String.valueOf(freq[ch]);
        added[ch] = false; // avoid duplicates
        index++;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section: take the user inputs
    System.out.print("Enter the text: ");
    String text = sc.nextLine();

    // method calling
    String[][] frequencies = findFrequencies(text);

    // display results
    System.out.println("\nCharacter\tFrequency");
    System.out.println("-------------------------");

    for (int i = 0; i < frequencies.length; i++) {
      System.out.println(frequencies[i][0] + "\t\t" + frequencies[i][1]);
    }

    sc.close();
  }
}
