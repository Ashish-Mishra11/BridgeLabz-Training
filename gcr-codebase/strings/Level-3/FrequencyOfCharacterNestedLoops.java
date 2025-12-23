import java.util.Scanner;

public class FrequencyOfCharacterNestedLoops {


  // Method to find frequency of characters using nested loops
  public static String[] findCharacterFrequency(String text) {
    char[] chars = text.toCharArray();
    int[] freq = new int[chars.length];
    // Initialize frequency and count using nested loops
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == '0') {
        continue;
      }

      freq[i] = 1;

      for (int j = i + 1; j < chars.length; j++) {
        if (chars[i] == chars[j]) {
          freq[i]++;
          chars[j] = '0'; // mark duplicate
        }
      }
    }
    // Count unique characters
    int count = 0;
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] != '0') {
        count++;
      }
    }
    // Create 1D String array for result
    String[] result = new String[count];
    int index = 0;
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] != '0') {
        result[index] = chars[i] + " : " + freq[i];
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
    String[] frequencyResult = findCharacterFrequency(text);

    // display section : display the results
    System.out.println("\nCharacter Frequency:");
    System.out.println("--------------------");

    for (int i = 0; i < frequencyResult.length; i++) {
      System.out.println(frequencyResult[i]);
    }

    sc.close();
  }
}
