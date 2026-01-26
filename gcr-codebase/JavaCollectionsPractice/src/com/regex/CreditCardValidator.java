package com.regex;
import java.util.Scanner;

class CreditCardValidator {

    public static boolean isValidCreditCard(String cardNumber) {

        // Visa: starts with 4, 16 digits
        // MasterCard: starts with 5, 16 digits
        String regex = "^(4[0-9]{15}|5[0-9]{15})$";

        return cardNumber.matches(regex);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter credit card number");
        System.out.println("Example: 4123456789012345 for Visa");
        System.out.println("Example: 5123456789012345 for MasterCard");

        String cardNumber = sc.nextLine();

        if (isValidCreditCard(cardNumber)) {
            System.out.println("Credit card number is Valid");
        } else {
            System.out.println("Credit card number is Invalid");
        }

        sc.close();
    }
}
