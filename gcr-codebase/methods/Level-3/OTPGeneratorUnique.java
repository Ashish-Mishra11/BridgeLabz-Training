public class OTPGeneratorUnique {

  // Method section: create the necessary methods
  // Method to generate a 6-digit OTP
  public static int generateOTP() {
    // Generates number from 100000 to 999999
    return (int)(Math.random() * 900000) + 100000;
  }
  // Method to check whether all OTPs are unique
  public static boolean areOTPsUnique(int[] otps) {
    for (int i = 0; i < otps.length; i++) {
      for (int j = i + 1; j < otps.length; j++) {
        if (otps[i] == otps[j]) {
          return false; 
        }
      }
    }
    return true;
  }

  public static void main(String[] args) {

    // Declaration section: Declare the array to store the  random OTP
    int[] otpArray = new int[10];

    // Logic section: Generate OTPs 10 times
    for (int i = 0; i < otpArray.length; i++) {
      otpArray[i] = generateOTP();
    }

    // Display section: Display generated OTPs
    System.out.println("Generated OTPs:");
    for (int otp : otpArray) {
      System.out.println(otp);
    }

    //Validation section:  Validate uniqueness
    if (areOTPsUnique(otpArray)) {
      System.out.println("All generated OTPs are unique.");
    } else {
      System.out.println("Duplicate OTPs found.");
    }
  }
}
