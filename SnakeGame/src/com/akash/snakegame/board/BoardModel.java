package com.akash.snakegame.board;
import com.akash.snakegame.model.Board;

public class BoardModel {
    private BoardView boardView;
    public BoardModel(BoardView boardView){
        this.boardView = boardView;
    }

    public void createBoard(int boardSize) {
        Board board = new Board(boardSize);
        board.setBoard(board);
    }
}
