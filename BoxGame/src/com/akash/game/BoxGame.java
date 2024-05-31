package com.akash.game;

import com.akash.game.model.Board;
import com.akash.game.model.Shape;
import com.akash.game.view.StartGame;

import java.util.ArrayList;
import java.util.List;

public class BoxGame {
    private static BoxGame boxGame;

    private Board board;

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public static BoxGame getBoxGame(){
        if (boxGame == null){
            boxGame = new BoxGame();
        }
        return boxGame;
    }

    List<Shape> shapeList = new ArrayList<>();
    public List<Shape> getShapeList() {
        return shapeList;
    }
    public void addShape(Shape s){
        shapeList.add(s);
    }
    private String appName =" Welcome to Box Game";
    private String appVersion = "1.0.1";
    public void init(){
        System.out.println(appName+"and the version is : "+appVersion);
        StartGame startGame = new StartGame();
        startGame.init();
    }

    public static void main(String[] args) {
        BoxGame.getBoxGame().init();
    }
}
