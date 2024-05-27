package com.akash.suermario;

import java.util.Scanner;

public class SuperMarioApp {
    Scanner scanner = new Scanner(System.in);
    private static SuperMarioApp superMarioApp;
    public static SuperMarioApp getInstance(){
        if (superMarioApp == null){
            superMarioApp = new SuperMarioApp();
        }
        return superMarioApp;
    }
    public static void main(String[] args) {
        SuperMarioApp.getInstance().init();
    }

    public void init() {
        System.out.println("Welcome To SuperMarioApp");
        Board board = new Board();
        board.setupBoard();
        startGame(board);
    }

    private void startGame(Board board) {
        while (true){
            board.printBoard();
            System.out.println("1 --> Move Top\n2 --> Move Down\n3 --> Move Left\n4 --> Move Right");
            int choice = scanner.nextInt();
            switch (choice){
                case 1 : {
                    board.moveTop();
                    break;
                }
                case 2 : {
                    board.moveBottom();
                    System.out.println("Move Down");
                    break;
                }
                case 3 : {
                    board.moveLeft();
                    break;
                }
                case 4 : {
                    board.moveRight();
                    break;
                }
                case 5 : {
                    board.setBomb();
                    break;
                }
                default:{
                    System.out.println("Please Enter a Valid Choice");
                    break;
                }
            }
        }
    }
}
