import java.util.Scanner;
public class EqualString {
  
  // Method section: create the method to compare the strings
  public static boolean compareStrings(String string1, String string2) {
    if(string1.length() != string2.length()) {
      return false;
    } else {
      for(int i = 0; i < string1.length(); i++) {
        if(string1.charAt(i) != string2.charAt(i)) {
          return false;
        } 
      }
    }
    return true;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // Input section: take the inputs from the user
    System.out.println("Enter the string one: ");
    String string1 = sc.next();
    System.out.println("Enter the string two: ");
    String string2 = sc.next();

    boolean isSame = compareStrings(string1, string2);

    // Checking through the built in method
    boolean isSame1 = string1.equals(string2);

    // Display results: display the results
    if(isSame && isSame1) {
      System.out.println("Both the strings are same and checked through equals method and compare method");
    } else {
      System.out.println("Both the results are same but strings are not equal");
    }
 
    sc.close();
  }
}