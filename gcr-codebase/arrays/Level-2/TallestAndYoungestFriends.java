// Create TallestAndYoungestFriends class to find youngest and tallest friend among the three

import java.util.Scanner;
public class TallestAndYoungestFriends {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Declaration section: Declare the array for names, age, height
    String[] names = {"Amar", "Akbar", "Anthony"};
    int[] age = new int[3];
    double[] height = new double[3];
    int youngestIndex = 0;
    int youngest = Integer.MAX_VALUE;
    double tallest = Integer.MIN_VALUE;
    int tallestIndex = 0;

    // Input section: take input of  age and height of friends from user
    for (int i = 0; i < 3; i++) {
      System.out.println("Enter details of " + names[i]);
      System.out.print("Enter age: ");
      age[i] = sc.nextInt();
      System.out.print("Enter height (in cm): ");
      height[i] = sc.nextDouble();
    }

    // Logic section: Find youngest and tallest among three 
    for (int i = 0; i < 3; i++) {
      if (age[i] < youngest) {
        youngest = age[i];
        youngestIndex = i;
      }
      if (height[i] > tallest) {
        tallest = height[i];
        tallestIndex = i;
      }
    }

    // Display section: Display the value
    System.out.println("\nYoungest Friend: " + names[youngestIndex] +
                       " (Age: " + age[youngestIndex] + ")");
    System.out.println("Tallest Friend: " + names[tallestIndex] +
                       " (Height: " + height[tallestIndex] + " cm)");

    sc.close();
  }
}
