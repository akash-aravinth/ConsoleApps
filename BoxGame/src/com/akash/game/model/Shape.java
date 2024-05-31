package com.akash.game.model;

public class Shape {

    private int shapeId;
    private int row;
    private int col;
    private int matrix[][];
    public Shape(int row,int col,int id){
        this.shapeId = id;
        this.row = row;
        this.col = col;
        matrix = new int[row][col];
    }

    public int getShapeId() {
        return shapeId;
    }

    public void setShapeId(int shapeId) {
        this.shapeId = shapeId;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
}
