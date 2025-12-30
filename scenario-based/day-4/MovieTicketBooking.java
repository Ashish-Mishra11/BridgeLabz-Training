/*14. Movie Ticket Booking App 🎬
Ask users for movie type, seat type (gold/silver), and snacks.
● Use switch and if together.
● Loop through multiple customers.
● Clean structure and helpful variable names.*/

import java.util.Scanner;

public class MovieTicketBooking {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   
    System.out.println("Mobile Ticket Booking");
    while(true) {
      // Input section: take the user inputs
      System.out.println("-------------Movie type------------");
      System.out.println("  1.Comedy  ");
      System.out.println("  2.Horror  ");
      System.out.println("  3.Drama   ");
      System.out.println("  4.Exit");
      System.out.print("Enter the choice(1,2,3,4): ");
      int choice1 = sc.nextInt();
  
      if(choice1 == 4) {
        break;
      }
      if(choice1 <= 0 || choice1 > 4) {
        System.out.println("Enter wrong inputs Please try again");
        continue;
      }
      System.out.println("-------------Seat type------------");
      System.out.println("  1.gold seat  ");
      System.out.println("  2.silver seat  ");
      System.out.println("Enter the choice(1,2): ");
      int choice2 = sc.nextInt();

      
      if(choice2 != 1 && choice2 != 2) {
        System.out.println("  Your entered wrong please try again ");
        continue;
      }  
   
      System.out.println("-------------Snacks option------------");
      System.out.println("Enter 1 if you want snacks else enter 0 :");
      int choice3 = sc.nextInt();

      if(choice3 != 1 && choice3 != 0) {
        System.out.println("  Your entered wrong please try again ");
        continue;
      }  
      System.out.println("=====================================");
      System.out.println("        Your Movie Booking status    ");
      System.out.println("=====================================\n");
      
      // Display section: display the results
      switch(choice1) {
        case 1 -> {
            System.out.println("  You successfully booked comedy movie ticket ");
        }
        case 2 -> {
            System.out.println("  You successfully booked Horror movie ticket ");
        }
        case 3 -> {
            System.out.println("  You successfully booked Drama movie ticket ");
        }
      }
    
      if(choice2 == 1) {
        System.out.println("  Your cost of gold seat is 2500");
      } else if(choice2 == 2) {
        System.out.println("  Your cost of silver seat is 1000");
      }

      if(choice3 == 1) {
        System.out.println("  You selected for snacks");
      } else if(choice3 == 0) {
        System.out.println("  You did not select for snacks");
      } 
      
      
     
    }
  
     sc.close();
  }
}