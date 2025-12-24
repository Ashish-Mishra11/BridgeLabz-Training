import java.util.Scanner;

public class PalindromeCheck {
  
  // Method to check whether the given string is palindrome or not
  public static boolean checkPalindrome(String s) {
    for(int i = 0; i < s.length()/2; i++) {
      if(s.charAt(i) != s.charAt(s.length() - 1 - i)) {
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    //Input section: take the user inputs
    System.out.println("Enter the string: ");
    String s = sc.next();

    // Method calling
    boolean ans = checkPalindrome(s);

    // Display results
    System.out.println("String is palindrome: "+ ans);


    sc.close();
  }
}