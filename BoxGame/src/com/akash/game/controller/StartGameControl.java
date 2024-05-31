package com.akash.game.controller;

import com.akash.game.BoxGame;
import com.akash.game.model.Board;
import com.akash.game.model.Shape;
import com.akash.game.view.StartGame;

import java.util.Scanner;

public class StartGameControl {
    Scanner scanner = new Scanner(System.in);
    private StartGame startGame;
    public StartGameControl(StartGame startGame){
        this.startGame = startGame;
    }
     private Board board;
    public void createBoard(int row, int col) {
        this.board = new Board(row,col);
        BoxGame.getBoxGame().setBoard(board);
    }

    private void printBoard() {
        System.out.println();
        System.out.println();
        System.out.println("   0  1  2  3  4  5  6  7  8  9  0  1  2  3  4  5 ");
        for (int i =0;i<board.getRow();i++){
            System.out.print("| ");
            for (int j=0;j<board.getCol();j++){
                if (board.getMatrix()[i][j] == 0){
                    System.out.print("   ");
                }else if (board.getMatrix()[i][j] == 1){
                    System.out.print(" R ");
                }else if (board.getMatrix()[i][j] == 2){
                    System.out.print(" G ");
                }else if (board.getMatrix()[i][j] == 3){
                    System.out.print(" Y ");
                }else if (board.getMatrix()[i][j] == 4){
                    System.out.print(" W ");
                }else if(board.getMatrix()[i][j] == 5){
                    System.out.print(" B ");
                }
            }
            System.out.print("  |");
            System.out.println();
        }
        System.out.println();
        System.out.println("   ------------------------------------------------              ");
    }

    public void createShapes(int n) {
        Shape shape1 = new Shape(5,5,1);
        shape1.getMatrix()[0][0] = 1;
        shape1.getMatrix()[0][1] = 1;
        shape1.getMatrix()[0][2] = 1;
        shape1.getMatrix()[0][3] = 1;
        shape1.getMatrix()[0][4] = 1;
        Shape shape2 = new Shape(3,3,2);
        shape2.getMatrix()[0][0] = 2;
        shape2.getMatrix()[1][0] = 2;
        shape2.getMatrix()[2][0] = 2;
        shape2.getMatrix()[1][1] = 2;
        Shape shape3 = new Shape(3,3,3);
        shape3.getMatrix()[0][0] = 3;
        shape3.getMatrix()[0][1] = 3;
        shape3.getMatrix()[1][1] = 3;
        shape3.getMatrix()[1][2] = 3;
        Shape shape4 = new Shape(3,3,4);
        shape4.getMatrix()[0][0] = 4;
        shape4.getMatrix()[0][1] = 4;
        shape4.getMatrix()[1][1] = 4;
        shape4.getMatrix()[2][1] = 4;
        shape4.getMatrix()[2][2] = 4;
        Shape shape5 = new Shape(3,3,5);
        shape5.getMatrix()[0][0] = 5;
        shape5.getMatrix()[1][0] = 5;
        shape5.getMatrix()[2][0] = 5;
        shape5.getMatrix()[0][1] = 5;
        BoxGame.getBoxGame().addShape(shape1);
        BoxGame.getBoxGame().addShape(shape2);
        BoxGame.getBoxGame().addShape(shape3);
        BoxGame.getBoxGame().addShape(shape4);
        BoxGame.getBoxGame().addShape(shape5);
    }

    public Shape chooseShae(int id) {
        Shape shape = null;
        for (Shape s : BoxGame.getBoxGame().getShapeList()){
            if (s.getShapeId() == id){
                shape = s;
            }
        }
        return shape;
    }


    public void printShapes(Shape s) {
        System.out.println();
        for (int i=0;i<s.getRow();i++){
            for (int j =0;j<s.getCol();j++){
                if (s.getMatrix()[i][j] == 1){
                    System.out.print(" 1 ");
                }else if (s.getMatrix()[i][j] == 2){
                    System.out.print(" 2 ");
                }else if (s.getMatrix()[i][j] == 3){
                    System.out.print(" 3 ");
                }else if (s.getMatrix()[i][j] == 4){
                    System.out.print(" 4 ");
                }else if(s.getMatrix()[i][j] == 5){
                    System.out.print(" 5 ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public void printAllShapes() {
        System.out.println();
        for (Shape s : BoxGame.getBoxGame().getShapeList()){
            printShapes(s);
        }
    }

    public void rotateShape(Shape shape) {
        System.out.println("Your Shape is You Can Modify choose 1 ");
        boolean rotate = true;
        while (rotate){
            printShapes(shape);
            System.out.println("Do You Want To Rotate Then press 1");
            int pre = scanner.nextInt();
            if (pre == 1){
               rotateOnes(shape);
            }else {
                rotate = false;
            }
        }
    }

    private void rotateOnes(Shape shape) {
        int[][] matrix = new int[shape.getRow()][shape.getCol()];
        for (int i=0;i<shape.getRow();i++){
            for (int j=0;j<shape.getCol();j++){
                matrix[i][j] = shape.getMatrix()[j][i];
            }
        }
        shape.setMatrix(matrix);
    }

    public void insertShape(Shape shape, int pos) {
        int index[] = checkIsOk(shape);
        int size = index[1]-index[0]+1;
        if(pos+size > board.getCol()){
            startGame.showAlert("You Can Not Fix the "+pos+" Plaese change Position");
            startGame.initiate();
        }
        moveShape(shape,pos,size);
    }

    private void moveShape(Shape shape, int pos, int size) {
        int row = 0;
        int col = 0;
        for (int i = 0;i<shape.getRow();i++){
            col = 0;
            for (int j = pos;j<pos+size;j++){
                if (board.getMatrix()[i][j]==0){
                    board.getMatrix()[i][j]= shape.getMatrix()[row][col];
                }else{
                    GameOver();
                }
                col++;
            }
            row++;
        }
        printBoard();
        moveDown(shape,pos,size,row,col);
    }

    private void moveDown(Shape shape, int pos, int size, int row, int col) {

    }

    private void GameOver() {
    }

    private int[] checkIsOk(Shape shape) {
        int arr[] = new int[2];
        int start = 0;
        int end = 0;
        boolean flag = false;
         out : for (int i = 0;i<shape.getCol();i++){
             int count = 0;
            for (int j =0;j<shape.getRow();j++){
                if (shape.getMatrix()[j][i] == 0 && flag){
                    count++;
                    if (count == shape.getCol()){
                        end = i-1;
                        flag = false;
                        break out;
                    }
                }
                if (shape.getMatrix()[j][i] != 0 && !flag){
                    flag = true;
                    start = i;
                }
            }
        }
        if (flag){
            end = shape.getCol()-1;
        }
         arr[0] = start;
         arr[1] = end;
         return arr;
    }
}
