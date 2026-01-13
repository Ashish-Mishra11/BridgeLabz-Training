package com.day08.gamebox;
public class ArcadeGame extends Game {

    public ArcadeGame(String title, double price, double rating) {
        super(title, "Arcade", price, rating);
    }

    public void download() {
        System.out.println("Arcade game downloaded");
    }

    public void playDemo() {
        System.out.println("Arcade demo with quick levels");
    }
}
