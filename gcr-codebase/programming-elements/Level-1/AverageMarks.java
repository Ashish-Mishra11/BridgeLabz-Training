// Writing a java code to find the average percentage marks in PCM
// Create AverageMarks class to compute Sam's average marks
public class AverageMarks
{
  public static void main(String[] args)
  {
    // Input section: Create variables maths, physics and chemistry to store marks of each 
    int maths = 94, physics = 95, chemistry = 96;

    // Logic section: Calculate average
    double average = (maths + physics + chemistry) / 3.0;

    // Display section: Display average marks 
    System.out.println("Sam's average mark in PCM is " + average);
  }
}
