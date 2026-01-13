package com.day08.gamebox;
import java.util.Scanner;

public class GameBoxDriver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        User user = new User(10);

        while (true) {

            System.out.println("1 Add Game");
            System.out.println("2 Apply Offer");
            System.out.println("3 Download Game");
            System.out.println("4 Play Demo");
            System.out.println("5 Buy Game");
            System.out.println("6 Show Library");
            System.out.println("7 Exit");

            int choice = sc.nextInt();
            Game game = null;

            if (choice == 1) {
                System.out.println("1 Arcade Game 2 Strategy Game");
                int type = sc.nextInt();

                System.out.println("Enter title");
                String title = sc.next();

                System.out.println("Enter price");
                double price = sc.nextDouble();

                System.out.println("Enter rating");
                double rating = sc.nextDouble();

                if (type == 1) {
                    game = new ArcadeGame(title, price, rating);
                } else {
                    game = new StrategyGame(title, price, rating);
                }

                System.out.println("Game created");
            }

            else if (choice == 2) {
                if (game != null) {
                    System.out.println("Enter discount percent");
                    double d = sc.nextDouble();
                    game.applyOffer(d);
                    System.out.println("Updated price " + game.getPrice());
                }
            }

            else if (choice == 3) {
                if (game != null) {
                    game.download();
                }
            }

            else if (choice == 4) {
                if (game != null) {
                    game.playDemo();
                }
            }

            else if (choice == 5) {
                if (game != null) {
                    user.buyGame(game);
                }
            }

            else if (choice == 6) {
                user.showLibrary();
            }

            else {
                System.out.println("Thank you for using GameBox");
                break;
            }
        }
        sc.close();
    }
}
