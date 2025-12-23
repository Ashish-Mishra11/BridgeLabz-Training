import java.util.Scanner;

public class FrequencyOfCharacterUsingUnique {

  // Method section: create the necessary methods
  // Method to find unique characters using nested loops and charAt()
  public static char[] findUniqueCharacters(String text) {
    char[] temp = new char[text.length()];
    int count = 0;

    for (int i = 0; i < text.length(); i++) {
      char current = text.charAt(i);
      boolean isUnique = true;

      for (int j = 0; j < i; j++) {
        if (current == text.charAt(j)) {
          isUnique = false;
          break;
        }
      }

      if (isUnique) {
        temp[count] = current;
        count++;
      }
    }
    // Create exact-size array
    char[] uniqueChars = new char[count];
    for (int i = 0; i < count; i++) {
      uniqueChars[i] = temp[i];
    }
    return uniqueChars;
  }
  // Method to find frequency using unique characters
  public static String[][] findCharacterFrequency(String text) {
    int[] freq = new int[256];
    // Count frequency of each character
    for (int i = 0; i < text.length(); i++) {
      freq[text.charAt(i)]++;
    }
    // Get unique characters
    char[] uniqueChars = findUniqueCharacters(text);
    // Create 2D result array
    String[][] result = new String[uniqueChars.length][2];
    for (int i = 0; i < uniqueChars.length; i++) {
      char ch = uniqueChars[i];
      result[i][0] = String.valueOf(ch);
      result[i][1] = String.valueOf(freq[ch]);
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section: take the user inputs
    System.out.print("Enter the text: ");
    String text = sc.nextLine();

    // method call
    String[][] frequency = findCharacterFrequency(text);

    // display the results
    System.out.println("\nCharacter\tFrequency");
    System.out.println("-------------------------");

    for (int i = 0; i < frequency.length; i++) {
      System.out.println(frequency[i][0] + "\t\t" + frequency[i][1]);
    }

    sc.close();
  }
}
