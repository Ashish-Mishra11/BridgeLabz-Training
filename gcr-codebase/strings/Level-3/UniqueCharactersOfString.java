import java.util.Scanner;

public class UniqueCharactersOfString {
  
  // Method section: create the necessary 
  // Method to find length without using length()
  public static int findLength(String text) {
    int count = 0;

    try {
      while (true) {
        text.charAt(count);
        count++;
      }
    } catch (StringIndexOutOfBoundsException e) {
      // Exception indicates end of string
    }
    return count;
  }
  // Method to find unique characters using charAt()
  public static char[] findUniqueCharacters(String text) {
    int length = findLength(text);
    char[] temp = new char[length];
    int uniqueCount = 0;

    for (int i = 0; i < length; i++) {
      char current = text.charAt(i);
      boolean isUnique = true;

      for (int j = 0; j < i; j++) {
        if (current == text.charAt(j)) {
          isUnique = false;
          break;
        }
      }

      if (isUnique) {
        temp[uniqueCount] = current;
        uniqueCount++;
      }
    }
    // Create array of exact size for unique characters
    char[] result = new char[uniqueCount];
    for (int i = 0; i < uniqueCount; i++) {
      result[i] = temp[i];
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section: take the user inputs
    System.out.print("Enter the text: ");
    String text = sc.nextLine();

    // Method calling
    char[] uniqueChars = findUniqueCharacters(text);

    // Display section: display the results
    System.out.print("Unique characters: ");
    for (int i = 0; i < uniqueChars.length; i++) {
      System.out.print(uniqueChars[i] + " ");
    }

    sc.close();
  }
}
