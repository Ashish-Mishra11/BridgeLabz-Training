import java.util.Scanner;

public class ConsonantVowelCounter {

  // Method section: create the necessary methods
  // Method to check whether a character is vowel, consonant, or not a letter
  public static String checkCharacter(char ch) {
    if (ch >= 'A' && ch <= 'Z') {
      ch = (char)(ch + 32);
    }
    if (ch >= 'a' && ch <= 'z') {
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        return "Vowel";
      } else {
        return "Consonant";
      }
    }
    return "Not a Letter";
  }
  // Method to find vowels and consonants in a string
  // Returns int array: [vowelCount, consonantCount]
  public static int[] findVowelsAndConsonants(String text) {
    int vowelCount = 0;
    int consonantCount = 0;

    for (int i = 0; i < text.length(); i++) {
      char ch = text.charAt(i);
      String result = checkCharacter(ch);

      if (result.equals("Vowel")) {
        vowelCount++;
      } else if (result.equals("Consonant")) {
        consonantCount++;
      }
    }
    return new int[]{vowelCount, consonantCount};
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section: take the user inputs
    System.out.println("Enter the text:");
    String text = sc.nextLine();

    // Method call
    int[] counts = findVowelsAndConsonants(text);

    // Display section: Display the results
    System.out.println("Number of Vowels     : " + counts[0]);
    System.out.println("Number of Consonants : " + counts[1]);

    sc.close();
  }
}
