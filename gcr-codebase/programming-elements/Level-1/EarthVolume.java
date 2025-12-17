// Writing a java code to compute the volume of earth in Km^3 and miles^3
// Create VolumeOfEarth class to compute the volume of earth
public class EarthVolume
{
  public static void main(String[]args)
  { 
    // Create a variable radiusKm to store radius in kilometers
    double radiusKm = 6378; //

    // create a variable KmToMiles 1 km = 0.621371 miles
    double kmToMiles = 0.621371;

    // Create a variable volumeKm3 to store volume in kilometers
    double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3); //

    // Create a variable radiusMiles to store the radius in miles
    double radiusMiles = radiusKm * kmToMiles;
        
    // Create a variable volumeMiles3 to store the volume in miles 
    double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);
       
    //Display the volume in cubic kilometers and cubic miles
    System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 +
                           " and cubic miles is " + volumeMiles3);
  }  
}
