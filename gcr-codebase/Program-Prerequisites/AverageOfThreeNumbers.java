import java.util.Scanner;
class AverageOfThreeNumbers
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first number: ");
    double firstNumber=sc.nextDouble();
    System.out.println("Enter the second number: ");
    double secondNumber=sc.nextDouble();
    System.out.println("Enter the third number: ");
    double thirdNumber=sc.nextDouble();
    double average=(firstNumber+secondNumber+thirdNumber)/3;
    System.out.println("Average of Three Numbers: "+average);
    sc.close();

  }
}