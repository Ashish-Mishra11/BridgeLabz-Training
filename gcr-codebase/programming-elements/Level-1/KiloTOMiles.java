// Writing a java code to convert the distance from kilometers to miles
// Create KiloTOMiles class to compute the distance in miles 
import java.util.Scanner;
public class KiloTOMiles
{
  public static void main(String [] args)
  {
    // Create the Scanner object to take the input from user
    Scanner sc=new Scanner(System.in);
    
    System.out.print("Enter the distance in kilometers: ");

    // Create a variable km to store the value in kilometers
    double km = sc.nextDouble();
    
    //1 mile = 1.6 km 

    // Create a variable miles to store the value in miles
    double miles = (1 / 1.6) * km;

    // Display the result
    System.out.println("The total miles is " + miles + " mile for the given " + km + " km");

    //close the Scanner object 
    sc.close();
  }
}