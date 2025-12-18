// Writing a java code to check for the natural number and print the sum of n natural numbers
// Create CheckNatural class to check for the natural number and print the sum of n natural numbers
import java.util.Scanner;
public class CheckNatural{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    // Input section: Create variable number to store the value given by user 
    System.out.print("Enter number: ");
    int number = sc.nextInt();

    // Logic section: Check for natural number and print sum of n natural  number
    if(number < 0){
      System.out.println("The number " + number + " is not a natural number");// Display not a natural number
    }
    else{
      int sum = (number * (number+1) / 2);
      System.out.println("The sum of " + number + " natural numbers is " +  sum);//Display the sum of n natural number
    }

    sc.close();
  }
}