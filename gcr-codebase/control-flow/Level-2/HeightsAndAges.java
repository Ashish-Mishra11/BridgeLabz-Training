// Writing a java code to find the youngest friends and tallest friends
// Create HeightsAndAges class to find the youngest friends and tallest friends

import java.util.Scanner;
public class HeightsAndAges {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input section: Create  variables to store a value given by user for ages and heights 
    System.out.print("Enter a Amar age: ");
    int amarAge = sc.nextInt();
    System.out.print("Enter a Akbar age: ");
    int akbarAge = sc.nextInt();
    System.out.print("Enter a Anthony age: ");
    int anthonyAge = sc.nextInt();
    System.out.print("Enter a Amar height: ");
    int amarheight = sc.nextInt();
    System.out.print("Enter a Akbar height: ");
    int akbarheight = sc.nextInt();
    System.out.print("Enter a Anthony height: ");
    int anthonyheight = sc.nextInt();
    

    // Logic section: Calculate the youngest and tallest friends
     //Finding youngest age  and displaying
    if(amarAge < akbarAge && amarAge < anthonyAge) {
      System.out.println("The Youngest friend is amar");
    } else if(akbarAge < amarAge && akbarAge < anthonyAge) {
      System.out.println("The Youngest friend is akbar");
    } else {
      System.out.println("The youngest friend is anthony");
    }
     //Finding tallest height and displaying
    if(amarheight > akbarheight && amarheight > anthonyheight) {
      System.out.println("The Tallest friend is amar");
    } else if(akbarheight > amarheight && akbarheight > anthonyheight) {
      System.out.println("The Tallest friend is akbar");
    } else {
      System.out.println("The Tallest friend is anthony");
    }
    

    sc.close();
  }
}