package com.regex;
import java.util.Scanner;

class LicensePlateValidator {

    public static boolean isValidLicensePlate(String plate) {
        String regex = "^[A-Z]{2}[0-9]{4}$";
        return plate.matches(regex);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter license plate number");
        String plate = sc.nextLine();

        if (isValidLicensePlate(plate)) {
            System.out.println("License plate is Valid");
        } else {
            System.out.println("License plate is Invalid");
        }

        sc.close();
    }
}
