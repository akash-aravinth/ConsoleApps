package com.akash.snakegame.board;

import com.akash.snakegame.model.Board;

import java.util.Scanner;

public class BoardView {
    Scanner scanner = new Scanner(System.in);
    private BoardModel boardModel;
    public BoardView(){
        boardModel = new BoardModel(this);
    }
    public void init(){
        System.out.println("Enter the Board Size : ");
        int boardSize = scanner.nextInt();
        boardModel.createBoard(boardSize);
        System.out.println("Board Create Successfully...\n");
    }

}
