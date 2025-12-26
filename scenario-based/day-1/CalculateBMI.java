import java.util.Scanner;
public class CalculateBMI {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
	
    //Input section: Create weight and height to store value given by user
    System.out.print("Enter the weight (in KG): ");
    double weight  = sc.nextDouble();
    System.out.print("Enter the height (in cm): ");
    double height= sc.nextDouble();
		
    //Logic section: Calculation of BMI
    double bmi = weight / (height * height / 10000);

    // Display section: Display the results
    if ( bmi > 40.0) {
      System.out.println("Obese");
    } else if ( bmi > 25.0 && bmi < 40.0) {
      System.out.println("Overweight");
    } else if ( bmi > 18.5 && bmi < 25) {
      System.out.println("Normal");
    } else if ( bmi <= 18.4) {
      System.out.println("Underweight");
    }


    sc.close();
  }
}