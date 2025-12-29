/*6. Parking Lot Gate System 🚗
Develop a smart parking system.
● Options: Park, Exit, Show Occupancy
● Use switch-case for the menu.
● while loop to continue until the parking lot is full or the user exits.*/

import java.util.Scanner;

public class ParkingLotGateSystem {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section: Take the user inputs for capacity of parking lot
    System.out.println("Enter the capacity of parking lot: ");
    int vacancy = sc.nextInt();
    int total = vacancy;
    System.out.println("-------------------------PARKING SYSTEM---------------------");   
 
    // logic and display section: run the parking lot system and display the results
    while(true) {
      System.out.println("Enter the inputs(park,exit,occupancy,close): ");
      String s = sc.next().trim().toLowerCase();
 
      if(s.equals("close")) {
        System.out.println("You are out of parking system ");
        break;
      }
      switch(s) {
        case "park": 
          if(vacancy == 0) {
            System.out.println("your capacity is full");
          } else{
          System.out.println("your vehicle parked");
          vacancy--;
          }
          break;
        case "occupancy":
          System.out.println("The available parking capacity is: " + (vacancy));
          break;
        case "exit":
          if(total == vacancy){
            System.out.println("No vehicle parked");
          } else {
          System.out.println("You moved out of parking area");
          vacancy++;
          }
          break;
        default:
          System.out.println("Entered the wrong inputs please enter it again");
      }
      
    }

    sc.close();
  }
}
