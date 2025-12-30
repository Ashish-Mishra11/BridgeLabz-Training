/* Rohan’s Library Reminder App
   Rohan wants a fine calculator:
   1. Input return date and due date.
   2. If returned late, calculate fine: ₹5/day.
   3. Repeat for 5 books using for-loop.
*/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class RohansLibraryFineCalculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int totalFine = 0;

    System.out.println("========================================");
    System.out.println("   Rohan's Library Fine Calculator ");
    System.out.println("   Fine: 5 Rupee per day for late return");
    System.out.println("========================================");
    System.out.println();

    // For-loop to process exactly 5 books
    for (int i = 1; i <= 5; i++) {
      System.out.println("--- Book " + i + " ---");

      // Input section: due date
      LocalDate dueDate = getDateFromUser(sc, "Enter due date (YYYY-MM-DD): ");

      // Input section: return date
      LocalDate returnDate = getDateFromUser(sc, "Enter return date (YYYY-MM-DD): ");

      // Logic section: calculate late days
      long daysLate = ChronoUnit.DAYS.between(dueDate, returnDate);

      if (daysLate > 0) {
        int fine = (int) daysLate * 5;
        System.out.println("Returned " + daysLate + " day(s) late.");
        System.out.println("Fine for this book: " + fine + " Rupee");
        totalFine += fine;
      } else {
        System.out.println("Returned on time. No fine.");
      }

      System.out.println();
    }

    // Display section: final result
    System.out.println("=== Summary ===");
    System.out.println("Total fine for 5 books: " + totalFine + " Rupees");

    sc.close();
  }

  // Method section: helper method for date input
  private static LocalDate getDateFromUser(Scanner scanner, String s) {

    while (true) {
      try {
        System.out.print(s);
        String input = scanner.nextLine();
        return LocalDate.parse(input); // YYYY-MM-DD
      } catch (Exception e) {
        System.out.println(
          "Invalid date format! Please enter in YYYY-MM-DD format.\n"
        );
      }
    }
  }
}
