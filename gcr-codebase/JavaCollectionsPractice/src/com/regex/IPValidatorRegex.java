package com.regex;
import java.util.Scanner;

class IPValidatorRegex {

    static boolean isValidIP(String ip) {
        // Regex for 0-255
        String zeroTo255 = "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
        String regex = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
        
        return ip.matches(regex);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an IP address to validate: ");
        String ip = sc.nextLine();

        if (isValidIP(ip)) {
            System.out.println(ip + " is a valid IPv4 address.");
        } else {
            System.out.println(ip + " is NOT a valid IPv4 address.");
        }

        sc.close();
    }
}
