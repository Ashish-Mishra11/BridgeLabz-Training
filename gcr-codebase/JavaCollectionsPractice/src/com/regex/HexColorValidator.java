package com.regex;
import java.util.Scanner;

class HexColorValidator {

    public static boolean isValidHexColor(String color) {
        String regex = "^#[0-9A-Fa-f]{6}$";
        return color.matches(regex);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter hex color code");
        System.out.println("Example input: #FFA500 or #ff4500");

        String color = sc.nextLine();

        if (isValidHexColor(color)) {
            System.out.println("Hex color is Valid");
        } else {
            System.out.println("Hex color is Invalid");
        }

        sc.close();
    }
}
