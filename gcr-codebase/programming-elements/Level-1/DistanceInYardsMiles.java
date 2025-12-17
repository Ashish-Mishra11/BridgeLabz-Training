// Writing a java code to compute the distance in yards and miles for distance provided by user in feets
// Create DistanceInYardsMiles class to calculate the distance in yards and miles
import java.util.Scanner;
public class DistanceInYardsMiles
{
  public static void main(String[] args)
  {
    // Input the distance in feets
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the distance in feets: ");
    double feet = sc.nextDouble();

    // Logic for conversion of distance from feets to yards and miles
    double yard = feet/3;
    double mile = yard/1760;

    // Display distance in yards and miles
    System.out.println("Your distance in feets is " + feet + " while in yards is " + yard + " and miles is " + mile);
    sc.close();

  }
}