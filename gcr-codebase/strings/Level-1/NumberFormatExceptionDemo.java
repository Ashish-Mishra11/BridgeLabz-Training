import java.util.Scanner;
public class NumberFormatExceptionDemo {

  // Methods to generate NumberFormatException
  public static void generateNumberFormatException(String s) {
    int number = Integer.parseInt(s);
  }
  // Method to handle NumberFormatException
  public static void handleNumberFormatException(String s) {
    try {
      int number = Integer.parseInt(s);
    } catch(NumberFormatException e) {
      System.out.println("Handling the Number Format Exception");
      System.out.println("Error:" + e.getMessage());
    } catch(RuntimeException e) {
      System.out.println("Handling the generic exception");
      System.out.println("Error:" + e.getMessage());
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    //Input section: take the user inputs
    System.out.println("Enter the number: ");
    String s = sc.next();

    // Display section: Display the results
    try {
      generateNumberFormatException(s);
    } catch(NumberFormatException e) {
      handleNumberFormatException(s);
    } catch(Exception e) {
      System.out.println("Handling the generic exception");
      System.out.println("Error:" + e.getMessage());
    }
    
    sc.close();
  }
}

