import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {

  // Method to perform date calculations
  public static LocalDate calculateDate(LocalDate date) {
    LocalDate result = date.plusDays(7);
    result = result.plusMonths(1);
    result = result.plusYears(2);
    result = result.minusWeeks(3);

    return result;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section
    System.out.println("Enter a date (YYYY-MM-DD): ");
    String inputDate = sc.nextLine();

    LocalDate date = LocalDate.parse(inputDate);

    // Method calling
    LocalDate finalDate = calculateDate(date);

    // Display result
    System.out.println("Original Date: " + date);
    System.out.println("Final Date after calculations: " + finalDate);

    sc.close();
  }
}
