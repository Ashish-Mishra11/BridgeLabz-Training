import java.util.Scanner;

public class NonRepeatingFirstCharacter {
  
  // Method section: create the necessary methods
  // Method to find first non-repeating character using charAt()
  public static char findFirstNonRepeatingChar(String text) {
    int[] freq = new int[256]; 

    for (int i = 0; i < text.length(); i++) {
      char ch = text.charAt(i);
      freq[ch]++;
    }

    for (int i = 0; i < text.length(); i++) {
      char ch = text.charAt(i);
      if (freq[ch] == 1) {
        return ch;
      }
    }

    return '\0';
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section: take the user inputs
    System.out.print("Enter the text: ");
    String text = sc.nextLine();

    // Method calling
    char result = findFirstNonRepeatingChar(text);

    // Display section: Display the results
    if (result != '\0') {
      System.out.println("First non-repeating character: " + result);
    } else {
      System.out.println("No non-repeating character found.");
    }

    sc.close();
  }
}
