import java.util.Scanner;

public class DuplicatesRemove {
  
  // Method to remove  the duplicates
  public static String removeDuplicateCharacter(String text) {
    String res = "";

    for (int i = 0; i < text.length(); i++) {
      char ch = text.charAt(i);
      boolean isPresent = false; 
      for (int j = 0; j  < res.length(); j++) {
        if (res.charAt(j) == ch) {
          isPresent = true;
          break;
        }
      }
 
      if (!isPresent) {
        res += ch;
      }
    }

    return res;
  }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    //Input section: take the user inputs
    System.out.println("Enter the string: ");
    String s = sc.next();

    // Method calling
    String ans = removeDuplicateCharacter(s);

    // Display results
    System.out.println("The string after removing duplicates:  "+ ans);

    sc.close();
  }
}