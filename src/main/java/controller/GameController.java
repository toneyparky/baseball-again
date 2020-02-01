package controller;

import domain.Result;

public class GameController {
    private static int EXIT_CODE = 0;

    public void startGame() {
    }

    public void terminateGame() {
        System.exit(EXIT_CODE);
    }

}
