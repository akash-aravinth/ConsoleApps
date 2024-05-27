package com.akash.snakegame.startgame;

import com.akash.snakegame.board.BoardView;
import com.akash.snakegame.model.Board;

public class StartGameModel {
    private StartGameView startGameView;
    public StartGameModel(StartGameView startGameView){
        this.startGameView = startGameView;
    }

    public void generateFood() {
        int val1 = (int)((Math.random())* Board.getInstance().getSize());
        int val2 = (int)((Math.random())*Board.getInstance().getSize());

    }

}
