import java.util.Scanner;

public class StringReverse {
  
  // Method to reverse the string
  public static String getReverse(String s) {
    String ans = "";

    for(int i = s.length()-1 ; i>= 0; i--) {
      ans += s.charAt(i);
    }
    return ans;
  }


  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    //Input section: take the user inputs
    System.out.println("Enter the string: ");
    String s = sc.nextLine();

    // Method calling
    String ans = getReverse(s);

    // Display results
    System.out.println("original string: "+ s);
    System.out.println("reversed string: "+ans);

    sc.close();
  }
}