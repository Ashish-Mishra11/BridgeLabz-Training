import java.util.Scanner;

public class CompareLexicographically {
  
  // Method to compare the order
  public static boolean comparelexicographically(String s1, String s2) {
    int length = Math.min(s1.length(), s2.length());
    int flag = 0;
    for(int i = 0; i < length; i++) {
      if(s1.charAt(i) < s2.charAt(i)) {
        flag = 1;
        return true;
      } else {
        return false;
      }
    }
    if(flag == 0) {
      if(s1.length() > s2.length()) {
        return false;
      } else {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    //Input section: take the user inputs
    System.out.println("Enter the string: ");
    String s1 = sc.next();
    System.out.println("Enter the string: ");
    String s2 = sc.next();

    // Method calling
    boolean ans = comparelexicographically(s1, s2);

    // Display results
    System.out.println(s1+" comes before "+ s2+ " in lexicographical order");
 

    sc.close();
  }
}