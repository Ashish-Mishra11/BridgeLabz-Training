import java.util.Scanner;
public class IllegalArgumentExceptionDemo {


  // Method to generate the IllegalArgumentException
  public static void generateIllegalArgumentException(String s) {
    String substring = s.substring(s.length()-1, 0);
  }
  // Method to handle  the IllegalArgumentException
  public static void handleIllegalArgumentException(String s) {
    try {
      String substring = s.substring(s.length()-1, 0);
    } catch(IllegalArgumentException e) {
      System.out.println("IllegalArgumentException is handled");
      System.out.println("Error: " + e.getMessage());
      System.out.println("-------------------------------------"+
                        "\n The program is running without abnormal termination");
    } catch(RuntimeException e) {
      System.out.println("generic exception is handled");
      System.out.println("Error: " + e.getMessage());
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  
    //Input section: take the user inputs
    System.out.println("Enter the string: ");
    String s = sc.next();
   
    // Display the results
    try {
      generateIllegalArgumentException(s);
    } catch(IllegalArgumentException e) {
      handleIllegalArgumentException(s);
    } catch(Exception e) {
      System.out.println("Handling generic exception");
      System.out.println("Error: " + e.getMessage());
    }
  
    sc.close();
  }
   
}