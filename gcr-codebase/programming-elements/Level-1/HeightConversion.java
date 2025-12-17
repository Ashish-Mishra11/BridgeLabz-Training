// Writing a java code to calculate the height in feet and inches 
// Create HeightConversion class to convert height from centimeters to feet and inches
import java.util.Scanner;
public class HeightConversion
{
  public static void main(String [] args)
  {
    // Input section
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the height in centimeters: ");
    double height=sc.nextDouble();

    // logic for conversion of height from centimeters to feet and inches 
    double inches=height/2.54;
    double feet=inches/12;

    // display the result 
    System.out.println("Your Height in cm is " + height + " while in feet is " + feet + " and inches is " + inches);
    sc.close();
  }

}