package com.day08.gamebox;
public class User {

    private Game[] ownedGames;
    private int count;

    public User(int size) {
        ownedGames = new Game[size];
        count = 0;
    }

    public void buyGame(Game game) {
        ownedGames[count] = game;
        count++;
        System.out.println("Game added to library");
    }

    public void showLibrary() {
        for (int i = 0; i < count; i++) {
            System.out.println(ownedGames[i].getTitle());
        }
    }
}
