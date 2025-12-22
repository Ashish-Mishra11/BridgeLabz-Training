import java.util.Scanner;
public class CollinearCheckUsingMethods {

  // Method section: create the necessary methods
  // Method using slope formula
  public static boolean isCollinearBySlope(
      int x1, int y1, int x2, int y2, int x3, int y3) {

    double slopeAB = (double)(y2 - y1) / (x2 - x1);
    double slopeBC = (double)(y3 - y2) / (x3 - x2);
    double slopeAC = (double)(y3 - y1) / (x3 - x1);

    if (slopeAB == slopeBC && slopeBC == slopeAC) {
      return true;
    }
    return false;
  }
  // Method using area of triangle formula
  public static boolean isCollinearByArea(
      int x1, int y1, int x2, int y2, int x3, int y3) {

    double area = 0.5 * (
        x1 * (y2 - y3) +
        x2 * (y3 - y1) +
        x3 * (y1 - y2)
    );

    if (area == 0) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section: take the user inputs
    System.out.print("Enter x1 y1: ");
    int x1 = sc.nextInt();
    int y1 = sc.nextInt();
    System.out.print("Enter x2 y2: ");
    int x2 = sc.nextInt();
    int y2 = sc.nextInt();
    System.out.print("Enter x3 y3: ");
    int x3 = sc.nextInt();
    int y3 = sc.nextInt();

    // Display section: Display the results 
    System.out.println("\nUsing Slope Formula:");
    if (isCollinearBySlope(x1, y1, x2, y2, x3, y3))
      System.out.println("Points are Collinear");
    else
      System.out.println("Points are NOT Collinear");

    System.out.println("\nUsing Area of Triangle Formula:");
    if (isCollinearByArea(x1, y1, x2, y2, x3, y3))
      System.out.println("Points are Collinear");
    else
      System.out.println("Points are NOT Collinear");

    sc.close();
  }
}
