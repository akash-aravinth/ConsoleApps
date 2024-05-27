package com.akash.snakegame.startgame;

import com.akash.snakegame.model.Board;

import java.util.Scanner;

public class StartGameView {
    Scanner scanner = new Scanner(System.in);
    private StartGameModel startGameModel;
    public StartGameView(){
        startGameModel = new StartGameModel(this);
    }
    public void init(){
       while (Board.getInstance().isGameOver()){
           startGameModel.generateFood();
           Board.getInstance().printBoard();
//           while (true){
//              gettingChoice();
//           }
       }
    }
    public void gettingChoice(){
        System.out.println("1 --> Go Top\n2 --> Go Bottom\n3 --> Go Left\n4 --> Go Right");
        int choice = scanner.nextInt();
        switch (choice){
            case 1 : {
                System.out.println("top");
                break;
            }
            case 2 : {
                System.out.println("Bottom");
                break;
            }
            case 3 : {
                System.out.println("Left");
                break;
            }
            case 4 : {
                System.out.println("right");
                break;
            }
            default:{
                System.out.println("Please Enter Valid Choice");
               gettingChoice();
               break;
            }
        }
    }
}
