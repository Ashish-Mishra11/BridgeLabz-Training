import java.util.Scanner;

public class ConsonantVowelType {

  // Method section: create the necessary methods
  // Method to check if character is Vowel, Consonant, or Not a Letter
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
  // Method to find character type using charAt()
  // Returns a 2D array: character and its type
  public static String[][] findCharacterTypes(String text) {
    String[][] result = new String[text.length()][2];

    for (int i = 0; i < text.length(); i++) {
      char ch = text.charAt(i);
      result[i][0] = String.valueOf(ch);
      result[i][1] = checkCharacter(ch);
    }
    return result;
  }
  // Method to display 2D array in tabular format
  public static void displayTable(String[][] data) {
    System.out.println("\nCharacter\tType");
    System.out.println("--------------------------");

    for (int i = 0; i < data.length; i++) {
      System.out.println(data[i][0] + "\t\t" + data[i][1]);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section : take the user inputs
    System.out.println("Enter the text:");
    String text = sc.nextLine();

    // Method calling
    String[][] result = findCharacterTypes(text);

    // Display section: Display the results
    displayTable(result);

    sc.close();
  }
}
