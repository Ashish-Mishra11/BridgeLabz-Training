public class NullPointerDemo {

  // Method section: create the method to generate the exception
  public static void generateNullPointerException() {
    String text = null;
    System.out.println(text.length());
  }
  // Method to handle the exception
  public static void handleNullPointerException() {
    String text = null;
    try{
      System.out.println(text.length());
    } catch(NullPointerException e) {
      System.out.println("The null Pointer is handled");
      System.out.println("Error: " + e.getMessage());
      System.out.println("-------------------------------------"+
                         "\n The program is running without abnormal termination");
    }
  }
  public static void main(String[] args) {
    try {
      //calling the method to generate the exception
      generateNullPointerException();
    } catch(NullPointerException e) {
      //calling the method to handle the exception
      handleNullPointerException();
    }
  }
}