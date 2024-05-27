package com.akash.snakegame;

import com.akash.snakegame.board.BoardView;
import com.akash.snakegame.startgame.StartGameView;

import java.util.Scanner;

public class SnakeGame {
    private static SnakeGame snakeGame;

    public static SnakeGame getInstance(){
        if (snakeGame == null){
            snakeGame = new SnakeGame();
        }
        return snakeGame;
    }
    private String appName = "SnakeGame";
    private String appVersion = "1.0.1";

    public String getAppVersion() {
        return appVersion;
    }

    public String getAppName() {
        return appName;
    }

    public void init(){
        System.out.println("Welcome To : "+getAppName());
        System.out.println("And the Version is : "+getAppVersion());
        BoardView boardView = new BoardView();
        boardView.init();
        StartGameView startGameView = new StartGameView();
        startGameView.init();
    }

    public static void main(String[] args) {
       SnakeGame.getInstance().init();
    }
}
