package com.day08.gamebox;
public class StrategyGame extends Game {

    public StrategyGame(String title, double price, double rating) {
        super(title, "Strategy", price, rating);
    }

    public void download() {
        System.out.println("Strategy game downloaded");
    }

    public void playDemo() {
        System.out.println("Strategy demo with tutorial mission");
    }
}
