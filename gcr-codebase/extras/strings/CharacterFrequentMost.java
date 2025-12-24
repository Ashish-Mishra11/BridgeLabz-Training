import java.util.Scanner;

public class CharacterFrequentMost {

  // Method to find the most frequent character
  public static char getMostFrequentChar(String s) {
    int[] frequency = new int[256];
    char result = ' ';
    int maxCount = 0;

    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      frequency[ch]++;
    }

    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (frequency[ch] > maxCount) {
        maxCount = frequency[ch];
        result = ch;
      }
    }

    return result;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section: take the user inputs
    System.out.println("Enter the string: ");
    String s = sc.nextLine();

    // Method calling
    char ans = getMostFrequentChar(s);

    // Display results: display the results
    System.out.println("String: " + s);
    System.out.println("Most Frequent Character: '" + ans + "'");

    sc.close();
  }
}
