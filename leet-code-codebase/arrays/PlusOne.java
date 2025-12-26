import java.util.Scanner;

class PlusOne {

  // Method to add one to the number represented by array
  public static int[] plusOne(int[] digits) {
    int l = digits.length;

    for (int i = l - 1; i >= 0; i--) {
      if (digits[i] < 9) {
        digits[i] = digits[i] + 1;
        return digits;
      }
      digits[i] = 0;
    }

    digits = new int[digits.length + 1];
    digits[0] = 1;
    return digits;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section
    System.out.print("Enter number of digits: ");
    int n = sc.nextInt();

    int[] digits = new int[n];
    System.out.println("Enter digits:");
    for (int i = 0; i < n; i++) {
      digits[i] = sc.nextInt();
    }

    // Method call
    int[] result = plusOne(digits);

    // Display section
    System.out.print("Result after plus one: ");
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + " ");
    }

    sc.close();
  }
}
