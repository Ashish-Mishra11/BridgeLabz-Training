import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {

  // Method to compare two dates
  public static void compareDates(LocalDate date1, LocalDate date2) {
    if (date1.isBefore(date2)) {
      System.out.println(date1 + " is before " + date2);
    } else if (date1.isAfter(date2)) {
      System.out.println(date1 + " is after " + date2);
    } else if (date1.isEqual(date2)) {
      System.out.println(date1 + " is the same as " + date2);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section
    System.out.println("Enter first date (YYYY-MM-DD): ");
    String input1 = sc.nextLine();
    LocalDate date1 = LocalDate.parse(input1);

    System.out.println("Enter second date (YYYY-MM-DD): ");
    String input2 = sc.nextLine();
    LocalDate date2 = LocalDate.parse(input2);

    // Method calling
    compareDates(date1, date2);

    sc.close();
  }
}
