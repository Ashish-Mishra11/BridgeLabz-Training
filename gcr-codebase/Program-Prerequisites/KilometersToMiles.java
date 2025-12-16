import java.util.Scanner;
class KilometersToMiles
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the distance travelled in kilometers: ");
    double distanceInKilometers=sc.nextDouble();
    double distanceInMiles=distanceInKilometers*0.621371;
    System.out.println("The distance in miles is: "+distanceInMiles);
    sc.close();
  }
}