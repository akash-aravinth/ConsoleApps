package com.akash.game.view;

import com.akash.game.controller.StartGameControl;
import com.akash.game.model.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StartGame {
    Scanner scanner = new Scanner(System.in);

    private StartGameControl startGameControl;
    public StartGame(){
        startGameControl = new StartGameControl(this);
    }
    public void init() {
        //System.out.println("Enter Board Row");
        int row = 15;
        //System.out.println("Enter Board Column");
        int col = 15;
        startGameControl.createBoard(row,col);
        //System.out.println("Enter No Of Shapes : ");
        int noOfShape = 5;
        startGameControl.createShapes(noOfShape);
        initiate();
    }

    public void initiate() {
        boolean flag = true;
        while (flag){
            startGameControl.printAllShapes();
            System.out.println("Please Choose Shape we have 5 shapes please enter 1-5");
            int id = scanner.nextInt();
            //choosing shape
            Shape shape = startGameControl.chooseShae(id);
            //rotate matrix method make that shape no of times
            startGameControl.rotateShape(shape);
            System.out.println("Enter the Position Insert the Shape 1 - 15");
            int pos = scanner.nextInt();
            startGameControl.insertShape(shape,pos);
        }
    }

    public void showAlert(String s) {
        System.out.println(s);
    }
}
