package com.regex;
import java.util.Scanner;

class SSNValidator {

    public static boolean isValidSSN(String ssn) {
        // SSN format: XXX-XX-XXXX
        String regex = "^\\d{3}-\\d{2}-\\d{4}$";
        return ssn.matches(regex);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter SSN (format XXX-XX-XXXX):");//123-45-6789 is valid
        String ssn = sc.nextLine();

        if (isValidSSN(ssn)) {
            System.out.println(ssn + " is valid");
        } else {
            System.out.println(ssn + " is invalid");//123456789 is invalid
        }

        sc.close();
    }
}
