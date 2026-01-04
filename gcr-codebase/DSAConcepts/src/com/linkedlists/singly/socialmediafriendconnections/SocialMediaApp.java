package com.linkedlists.singly.socialmediafriendconnections;
import java.util.Scanner;

public class SocialMediaApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UserLinkedList users = new UserLinkedList();
        int choice;

        do {
            System.out.println("\n--- Social Media Friend System ---");
            System.out.println("1. Add User");
            System.out.println("2. Add Friend Connection");
            System.out.println("3. Remove Friend Connection");
            System.out.println("4. Display Friends of User");
            System.out.println("5. Mutual Friends");
            System.out.println("6. Search User by ID");
            System.out.println("7. Search User by Name");
            System.out.println("8. Count Friends of Each User");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("User ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    users.addUser(id, name, age);
                    break;

                case 2:
                    System.out.print("User ID 1: ");
                    users.addFriend(sc.nextInt(), sc.nextInt());
                    break;

                case 3:
                    System.out.print("User ID 1: ");
                    users.removeFriend(sc.nextInt(), sc.nextInt());
                    break;

                case 4:
                    System.out.print("User ID: ");
                    users.displayFriends(sc.nextInt());
                    break;

                case 5:
                    System.out.print("User ID 1: ");
                    users.mutualFriends(sc.nextInt(), sc.nextInt());
                    break;

                case 6:
                    System.out.print("User ID: ");
                    users.searchById(sc.nextInt());
                    break;

                case 7:
                    sc.nextLine();
                    System.out.print("Name: ");
                    users.searchByName(sc.nextLine());
                    break;

                case 8:
                    users.countFriends();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 0);

        sc.close();
    }
}
