// Writing a java code to calculate the no. of pens received by each students 
// Create DistributedPens class to compute the pens received by each students
public class DistributedPens
{
  public static void main(String [] args)
  {
    // Create totalPens to store the total number of pens present
    int totalPens = 14;
    
    // Create totalStudents to store the total number of students present
    int totalStudents = 3;
    
    // Create penPerStu to store the pens received by each student
    int penPerStu = totalPens/totalStudents;
     
    // Create remainingPens to store the non-distributed pens
    int remainingPens = totalPens%totalStudents;
    
    // Display the pen received per student and non-distributed pens
    System.out.println("The Pen Per Student is " + penPerStu + " and the remaining pen not distributed is " + remainingPens);
  }
}