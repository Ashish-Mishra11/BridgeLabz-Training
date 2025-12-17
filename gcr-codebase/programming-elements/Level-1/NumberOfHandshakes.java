// Writing a java code to find the maximum number of handshakes among N number of students
// Create NumberOfHandshakes class to compute the total handshakes among N students
import java.util.Scanner;
public class NumberOfHandshakes
{
  public static void main(String[] args)
  {
    // Input section: Create variable numberOfStudents to store the total no. of Students 
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the total no. of Students: ");
    int numberOfStudents = sc.nextInt();
    
    // Logic section: Calculation of maximum number of possible handshakes 
    long handshakes = (long) numberOfStudents * (numberOfStudents - 1) / 2;


    // Display section: display the results 
    System.out.println("The number of possible handshakes are: " + handshakes);
    sc.close();
     
  }
}