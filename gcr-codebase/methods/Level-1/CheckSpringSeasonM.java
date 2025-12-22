// Create CheckSpringSeasonM class to check whether a season is Spring Season

public class CheckSpringSeasonM {

  // Method section: create method to check whether the given season is spring or not
  public static boolean checkSeasonStatus(int month, int day, boolean isSpring) {
    if(month >= 3 && month < 7) {
        if(month == 3 && day < 20) {
          isSpring = false;  
        } else if(month == 6 && day > 20) {
          isSpring = false;
        }
    } else {
      isSpring = false;
    }
    return isSpring;
  }
  public static void main(String[] args) {
        
    // Input section: Create variable month and day to store the value given by users using command line
    int month = Integer.parseInt(args[0]);
    int day = Integer.parseInt(args[1]);
    boolean isSpring = true;
    
  
    // Display section: Display whether given season is spring or not
    System.out.println(checkSeasonStatus(month, day, isSpring) ? "Its a Spring Season" : "Not a Spring Season");

    
  }
}