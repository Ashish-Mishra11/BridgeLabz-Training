import java.util.Scanner;
public class YoungestAndTallestFriends {

  // Method section: create the method and display the results
  // Method to find and display the youngest friend
  public static void findYoungest(int[] ages) {

    if (ages[0] < ages[1] && ages[0] < ages[2]) {
      System.out.println("Youngest Friend: Amar");
    } else if (ages[1] < ages[0] && ages[1] < ages[2]) {
      System.out.println("Youngest Friend: Akbar");
    } else {
      System.out.println("Youngest Friend: Anthony");
    }
  }
  // Method to find and display the tallest friend
  public static void findTallest(double[] heights) {

    if (heights[0] > heights[1] && heights[0] > heights[2]) {
      System.out.println("Tallest Friend: Amar");
    } else if (heights[1] > heights[0] && heights[1] > heights[2]) {
      System.out.println("Tallest Friend: Akbar");
    } else {
      System.out.println("Tallest Friend: Anthony");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] ages = new int[3];
    double[] heights = new double[3];

    // Input section: take the input from the user
    System.out.println("Enter age of Amar:");
    ages[0] = sc.nextInt();
    System.out.println("Enter height of Amar:");
    heights[0] = sc.nextDouble();
    System.out.println("Enter age of Akbar:");
    ages[1] = sc.nextInt();
    System.out.println("Enter height of Akbar:");
    heights[1] = sc.nextDouble();
    System.out.println("Enter age of Anthony:");
    ages[2] = sc.nextInt();
    System.out.println("Enter height of Anthony:");
    heights[2] = sc.nextDouble();

    // Method calls (display section inside methods)
    findYoungest(ages);
    findTallest(heights);

    sc.close();
  }
}
