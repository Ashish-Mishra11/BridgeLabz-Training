package com.regex;
import java.util.Scanner;

class UsernameValidator {

    public static boolean isValidUsername(String username) {
        String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";
        return username.matches(regex);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter username");
        String username = sc.nextLine();

        if (isValidUsername(username)) {
            System.out.println("Username is Valid");
        } else {
            System.out.println("Username is Invalid");
        }

        sc.close();
    }
}
