/*9. School Bus Attendance System 🚍
Track 10 students' presence.
● Use for-each loop on names.
● Ask "Present or Absent?"
● Print total present and absent counts.*/

import java.util.Scanner;

public class SchoolBusAttendanceSystem {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input and declaration section 
    int totalPresent = 0;
    int totalAbsent = 0;
    String []names = {"Ashish", "abhinav", "amit", "sumit", "akshat", "divyansh", "anuj", "hariom", "ravi", "abhishek"};
    System.out.printf("%-15s  %-15s\n","Names","either(P/A)");

    // Logic section
    for(String name: names) {
      System.out.printf("%-15s  %-15s", name, "Enter P for present or A for absent: ");
      String attendance = sc.next().toLowerCase();
      System.out.println();
      if(attendance.equals("p")) {
        totalPresent++;
      } else if(attendance.equals("a")) {
        totalAbsent++;
      }
    }
  
    // Display section: Display the result
    System.out.println("Present count    Absent count");
    System.out.printf("%-16d %-16d", totalPresent, totalAbsent);

    sc.close();
  }

}