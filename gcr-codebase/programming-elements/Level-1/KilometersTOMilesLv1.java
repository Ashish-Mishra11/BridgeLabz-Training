// Writing a java code to convert distance from kilometers to miles
// Create KilometersTOMilesLv1 class to convert distance from kilometers to miles
public class KilometersTOMilesLv1
{
  public static void main(String [] args)
  {
    // Create a variable distInKilo to store distance in kilometers
    double distInKilo = 10.8;

    // 1 km = 1.6 miles
    double distInMiles = 1.6*distInKilo;

    // Display distance in miles
    System.out.println("The distance 10.8 km in miles is " + distInMiles);
  }
}