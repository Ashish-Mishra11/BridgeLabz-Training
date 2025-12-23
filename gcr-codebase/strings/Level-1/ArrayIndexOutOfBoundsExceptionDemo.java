import java.util.Scanner;
public class ArrayIndexOutOfBoundsExceptionDemo {

  //Method section: Method to generate and handle the exception
  // Method to generate the exception
  public static void generateArrayIndexOutOfBoundsException(String[] names) {
    System.out.println(names[names.length]);
  }

  // Method to handle the exception
  public static void handleArrayIndexOutOfBoundsException(String[] names) {
    try {
      System.out.println(names[names.length]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Handling ArrayIndexOutOfBoundsException");
      System.out.println("Error: " + e.getMessage());
    } catch (RuntimeException e) {
      System.out.println("Handling generic RuntimeException");
      System.out.println("Error: " + e.getMessage());
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //Input section: take the user inputs from users
    System.out.print("Enter number of names: ");
    int n = sc.nextInt();

    String[] names = new String[n];

    for (int i = 0; i < n; i++) {
      System.out.print("Enter name " + (i + 1) + ": ");
      names[i] = sc.next();
    }

    // Display the results
    try {
      generateArrayIndexOutOfBoundsException(names);
    } catch (ArrayIndexOutOfBoundsException e) {
      handleArrayIndexOutOfBoundsException(names);
    } catch (Exception e) {
      System.out.println("Handling generic exception");
      System.out.println("Error: " + e.getMessage());
    }

    sc.close();
  }
}
