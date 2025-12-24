import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGameProgram {

  // Method to generate a random guess within range
  public static int generateGuess(int low, int high) {
    Random rd = new Random();
    return rd.nextInt(high - low + 1) + low;
  }

  // Method to get user feedback
  public static String getFeedback(int guess, Scanner sc) {
    System.out.println("Is your number " + guess + "?");
    System.out.println("Enter 'high' if guess is too high, 'low' if too low, 'correct' if guessed correctly:");
    return sc.nextLine().toLowerCase();
  }

  // Method to update the range based on feedback
  public static int[] updateRange(int guess, String feedback, int low, int high) {
    if (feedback.equals("high")) {
      high = guess - 1;
    } else if (feedback.equals("low")) {
      low = guess + 1;
    }
    return new int[] {low, high};
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Think of a number between 1 and 100");

    int low = 1;
    int high = 100;
    int guess;
    String feedback;

    while (true) {
      guess = generateGuess(low, high);
      feedback = getFeedback(guess, sc);

      if (feedback.equals("correct")) {
        System.out.println("Yay! I guessed your number: " + guess);
        break;
      }

      int[] range = updateRange(guess, feedback, low, high);
      low = range[0];
      high = range[1];

      if (low > high) {
        System.out.println("Hmm, something doesn't match. Are you sure about your answers?");
        break;
      }
    }

    sc.close();
  }
}
