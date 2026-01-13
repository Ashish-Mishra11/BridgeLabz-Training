package com.day08.homenest;
import java.util.Scanner;

public class HomeNestDriver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HomeNestUser user = new HomeNestUser(10);

        while (true) {

            System.out.println("1 Add Device");
            System.out.println("2 Turn On Device");
            System.out.println("3 Turn Off Device");
            System.out.println("4 Reset Device");
            System.out.println("5 Calculate Energy Usage");
            System.out.println("6 Exit");

            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.println("1 Light 2 Camera 3 Thermostat 4 Lock");
                int type = sc.nextInt();

                System.out.println("Enter Device Id");
                String id = sc.next();

                if (type == 1) user.addDevice(new Light(id));
                else if (type == 2) user.addDevice(new Camera(id));
                else if (type == 3) user.addDevice(new Thermostat(id));
                else if (type == 4) user.addDevice(new Lock(id));
            }

            else if (choice == 2) {
                System.out.println("Enter device index");
                int index = sc.nextInt();
                user.getDevice(index).turnOn();
            }

            else if (choice == 3) {
                System.out.println("Enter device index");
                int index = sc.nextInt();
                user.getDevice(index).turnOff();
            }

            else if (choice == 4) {
                System.out.println("Enter device index");
                int index = sc.nextInt();
                user.getDevice(index).reset();
            }

            else if (choice == 5) {
                System.out.println("Enter device index");
                int index = sc.nextInt();

                System.out.println("Enter hours");
                double hours = sc.nextDouble();

                System.out.println(user.getDevice(index).calculateEnergy(hours));
            }

            else {
                System.out.println("Thank you for using HomeNest");
                break;
            }
        }
        sc.close();
    }
}
