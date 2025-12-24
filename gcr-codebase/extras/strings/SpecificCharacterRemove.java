import java.util.Scanner;

public class SpecificCharacterRemove {

  // Method to remove a specific character from the string
  public static String removeCharacter(String s, char removeChar) {
    String ans = "";

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) != removeChar) {
        ans += s.charAt(i);
      }
    }

    return ans;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section: take the users input
    System.out.println("Enter the string: ");
    String s = sc.nextLine();

    System.out.println("Enter the character to remove: ");
    char removeChar = sc.next().charAt(0);

    // Method calling
    String ans = removeCharacter(s, removeChar);

    // Display results: display the results
    System.out.println("Modified String: " + ans);

    sc.close();
  }
}
