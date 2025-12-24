import java.util.Scanner;

public class CaseToggle {

  //Method to toggle the case of string
  public static String findToggleCase(String text) {
    String res = "";
    for (int i = 0; i < text.length(); i++) {
      char ch = text.charAt(i);
      if (ch >= 97) {
        ch = (char)(ch - 32);
      } else {
        ch = (char)(ch + 32);
      }
      res += ch;
    }
    return res;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      
    // Input section: take the user inputs
    System.out.println("Enter a String : ");
    String text = sc.next();

    //Method calling
    String toggleString = findToggleCase(text);
 
    // Display the results
    System.out.println("The toggled String is : " + toggleString);

    sc.close();
  }
}