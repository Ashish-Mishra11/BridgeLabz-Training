import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatting {

  // Method to display date in different formats
  public static void displayFormattedDates(LocalDate date) {
    DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

    System.out.println("dd/MM/yyyy : " + date.format(format1));
    System.out.println("yyyy-MM-dd : " + date.format(format2));
    System.out.println("EEE, MMM dd, yyyy : " + date.format(format3));
  }

  public static void main(String[] args) {

    // Get current date
    LocalDate currentDate = LocalDate.now();

    // Method calling
    displayFormattedDates(currentDate);
  }
}
