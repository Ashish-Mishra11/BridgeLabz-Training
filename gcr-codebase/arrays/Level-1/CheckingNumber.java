// Create CheckingNumber class to compare the first and last elements of the array and display if they equal, greater or less

import java.util.Scanner;
public class CheckingNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input and declaration section: create a array number of 5 integer elements and take user inputs  
    System.out.println("Enter the 5 number: ");
    int []number = new int[5];
    for(int i = 0; i < number.length; i++) {
      System.out.println("Enter the number: ");
      number[i] = sc.nextInt();
    }

    // Logic section: checking the sign of number and then further checking whether number is even or odd
      //Display section: Display the results
    for(int i = 0; i < number.length; i++) {
      if(number[i] > 0) {
        if(number[i] % 2 == 0) {
          System.out.println("The number is even");
        } else {
          System.out.println("The number is odd");
        }
 
      } else if(number[i] == 0) {
        System.out.println("The number is zero");
      } else {
        System.out.println("The number is negative");
      }
    }
    
    if(number[0] < number[4]) {
      System.out.println("first is less than last");
    } else if(number[0] > number[4]) {
      System.out.println("first is more than last");
    } else {
      System.out.println("first is equal to last");
    }

    sc.close();
  }
}