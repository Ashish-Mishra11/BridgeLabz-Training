// Writing a java code to Compute the percentage and then calculate the grade
//creating a class  GradeCalculation to Compute the percentage and then calculate the grade

import java.util.Scanner;
public class GradeCalculation {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
	
    //Input section: creating a variable and taking input from the user
    System.out.print("Enter physics marks: ");
    int physics = sc.nextInt();
    System.out.print("Enter chemistry marks: ");
    int chemistry = sc.nextInt();
    System.out.print("Enter maths marks: ");
    int maths = sc.nextInt();

    //Logic section: calculating average marks
    int percentage= ( physics + chemistry + maths)/3;
	
    // Display section: showing remakrs on the basis of average marks
    if( percentage < 39 ) {
      System.out.println("Remedial standards ");
    } else if( percentage > 39 && percentage <50 ) {
      System.out.println("Leve 1 - too below agency-normalized standards ");
    } else if( percentage > 49 && percentage < 60) {
      System.out.println("Leve 1 - well below agency-normalized standards ");
    } else if( percentage > 59 && percentage < 70 ) { 
      System.out.println("Leve 2 - too below agency-normalized standards  ");
    } else if( percentage > 69 && percentage < 80 ) {
      System.out.println("Leve 3 - too below agency-normalized standards  ");
    } else if( percentage > 79  ) {
      System.out.println("Leve 4 - too below agency-normalized standards  ");
    }
	

    sc.close();
  }
}