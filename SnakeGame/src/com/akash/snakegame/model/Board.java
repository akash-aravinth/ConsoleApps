package com.akash.snakegame.model;

public class Board {
    private int head[];
    private int tail[];
    private int food[];
    private int size;
    private int[][] snakeBoard;
    public Board(){}
    private static Board board;
    public void setBoard(Board board){
        this.board = board;
    }
    public static Board getInstance(){
        if (board == null){
            board = new Board();
        }
        return board;
    }
    //game over
    private boolean gameOver;
    public boolean isGameOver() {
        return gameOver;
    }
    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }
    public Board(int size){
        this.size = size;
        snakeBoard = new int[size][size];
        snakeBoard[size/2][size/2] = 1;
        int arr[] = {size/2,size/2};
        setHead(arr);
        setTail(arr);
        setGameOver(true);
    }
    public int[] getHead() {
        return head;
    }
    public int[] getTail() {
        return tail;
    }

    public int[] getFood() {
        return food;
    }

    public void setHead(int[] head) {
        this.head = head;
    }
    public void setTail(int[] tail) {
        this.tail = tail;
    }

    public void setFood(int[] food) {
        this.food = food;
    }

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public int[][] getSnakeBoard() {
        return snakeBoard;
    }
    public void setSnakeBoard(int[][] snakeBoard) {
        this.snakeBoard = snakeBoard;
    }
    public void printBoard() {
        for (int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                if(j==0 || j== size-1){
                    System.out.print("|");
                }
                if (snakeBoard[i][j] == 1){
                    System.out.print("> ");
                }else if (snakeBoard[i][j] == -1){
                    System.out.print("* ");
                }else if(snakeBoard[i][j] == 2){
                    System.out.print(" -");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
