package com.day01.ambulanceroute;
import java.util.Scanner;

class HospitalAppDriver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AmbulanceRoute route = new AmbulanceRoute();

        route.addUnit("Emergency");
        route.addUnit("Radiology");
        route.addUnit("Surgery");
        route.addUnit("ICU");

        while (true) {

            System.out.println("1 Route Patient");
            System.out.println("2 Mark Unit Unavailable");
            System.out.println("3 Remove Unit");
            System.out.println("4 Display Units");
            System.out.println("5 Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                route.routePatient();
            }

            else if (choice == 2) {
                System.out.println("Enter unit name");
                String name = sc.nextLine();
                route.markUnavailable(name);
            }

            else if (choice == 3) {
                System.out.println("Enter unit name");
                String name = sc.nextLine();
                route.removeUnit(name);
            }

            else if (choice == 4) {
                route.displayUnits();
            }

            else if (choice == 5) {
                System.out.println("System stopped");
                break;
            }

            else {
                System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}
