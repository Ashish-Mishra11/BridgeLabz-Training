// Writing a java code to check whether a season is Spring Season
// Create CheckSpringSeason class to check whether a season is Spring Season

public class CheckSpringSeason {
  public static void main(String[] args) {
        
    // Input section: Create variable month and day to store the value given by users using command line
    int month = Integer.parseInt(args[0]);
    int day = Integer.parseInt(args[1]);

    // Logic section: Checking whether a season is a Spring Season or not using conditional statements
    boolean isSpring = true;
    if(month >= 3 && month < 7) {
        if(month == 3 && day < 20) {
          isSpring = false;  
        } else if(month == 6 && day > 20) {
          isSpring = false;
        }
    } else {
      isSpring = false;
    }
  
    // Display section: Display whether given season is spring or not
    System.out.println(isSpring ? "Its a Spring Season" : "Not a Spring Season");

    
  }
}