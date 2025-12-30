/*12. Train Reservation Queue 🚆
Simulate a basic ticket booking system.
● Show menu with switch
● Allow multiple bookings using while-loop.
● Stop booking once seats reach zero (break).*/

import java.util.Scanner;

public class TrainReservationQueue {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section: take the user input 
    System.out.println("Enter the total tickets in train: ");
    int totalTickets = sc.nextInt();
    int seatOccupancy = 0;

    while(true) {
      if(seatOccupancy == totalTickets) {
        System.out.println("No seats available Please try again later");
        break;
      }
       
      // Show menu
      System.out.println("\n--- Menu ---");
      System.out.println("1. Book a Ticket");
      System.out.println("2. View Available Seats");
      System.out.println("3. cancel a booked seat");
      System.out.print("Enter your choice(1,2,3): ");
      
      // take the choice from user
      int choice = sc.nextInt();
      System.out.print("===================================");
      System.out.printf("%n      %s%n","Your status  ");
      System.out.println("===================================");

      // Display results
      switch(choice) {
        case 1 -> {
          System.out.println("Congratulations on successfully booking your train tickets");
          seatOccupancy++;
        }
        case 2 -> {
          System.out.println("The avaiable seats are: " + (totalTickets - seatOccupancy));
        }
        case 3 -> {
          if(seatOccupancy > 0) {
            System.out.println("You successfully cancelled your tickets");
            seatOccupancy--;
          } else {
            System.out.println("No booked tickets");
          }
          
        }
        default -> {
          System.out.println("Please enter the correct inputs");
        }
      }

    }

    sc.close();
  }
}