import java.util.Scanner;
public class StringIndexOutOfBoundsExceptionDemo {
  
  // Method to generate the exception
  public static void generateStringIndexOutOfBoundsException(String s) {
    char ch = s.charAt(s.length());
  }
  // Method to handle the exception
  public static void handleStringIndexOutOfBoundsException(StringIndexOutOfBoundsException e) {
    System.out.println("StringIndexOutOfBoundsException is handled");
    System.out.println("Error: " + e.getMessage());
    System.out.println("-------------------------------------"+
                         "\n The program is running without abnormal termination");
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 
    //Input section: take the user inputs
    System.out.println("Enter the string: ");
    String s = sc.next();
    
    // Display the results
    try {
      generateStringIndexOutOfBoundsException(s);
    } catch(StringIndexOutOfBoundsException e) {
      handleStringIndexOutOfBoundsException(e);
    }
    
    sc.close();
  } 
}