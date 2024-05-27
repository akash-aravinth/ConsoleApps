package com.akash.suermario;

public class Board {
    private int board[][];
    private int man[];

    public int[] getMan(){
        return man;
    }
    public void setMan(int arr[]){
        this.man = arr;
        board[arr[0]][arr[1]] = 1;
    }

    public Board(){
        board = new int[10][10];
        man = new int[2];
        System.out.println("Board Print");
    }

    public void setupBoard(){
        setDragon();
        setFire();
        setTreasure();
        board[0][0] = 1;
        setMan(getMan());
    }

    public void setTreasure(){
        int num1 = (int)(Math.random()*10);
        int num2 = (int)(Math.random()*10);
        board[num1][num2] = 2;
    }

    public void setDragon(){
        int start = 0;
        int end = 16;
        while (start < end){
            int num1 = (int)(Math.random()*10);
            int num2 = (int)(Math.random()*10);
            if (board[num1][num2] == 0){
                board[num1][num2] = -2;
            }else{
                end++;
            }
            start++;
        }
    }
    public void setFire(){
        int start = 0;
        int end = 16;
        while (start < end){
            int num1 = (int)(Math.random()*10);
            int num2 = (int)(Math.random()*10);
            if (board[num1][num2] == 0){
                board[num1][num2] = -1;
            }else{
                end++;
            }
            start++;
        }
    }
    public void printBoard(){
        for (int i=0;i<board.length;i++){
            System.out.print("|");
            for (int j =0;j<board[i].length;j++){
                if (board[i][j] == 0){
                    System.out.print("   |");
                } else if (board[i][j] == 1) {
                    System.out.print(" * |");
                }else if (board[i][j] == -1){
                    System.out.print(" F |");
                }else if (board[i][j] == -2){
                    System.out.print(" D |");
                }else if (board[i][j] == 2){
                    System.out.print(" @ |");
                }
            }
            System.out.println();
        }
    }
    public char whatNext(int arr[]){
        if ((arr[0] >= 10 || arr[0] < 0) || (arr[1] >=10 || arr[1] < 0)){
            return '0';
        }else if (board[arr[0]][arr[1]] == 1){
            return 'M';
        }else if (board[arr[0]][arr[1]] == -1){
            return 'F';
        }else if (board[arr[0]][arr[1]] == -2) {
            return 'D';
        } else if (board[arr[0]][arr[1]] == 2) {
            return '@';
        }
        return 'S';
    }
    public void moveTheMan(int arr[]){
        board[man[0]][man[1]] = 0;
        board[arr[0]][arr[1]] = 1;
    }
    public void gameOver(){
        System.out.println("Game is Over");
        System.out.println("You Can Start Another Game");
        System.out.println("Thank You For Playing With us");
        SuperMarioApp.getInstance().init();
    }

    public void moveTop() {
        int arr[] = getMan();
        board[getMan()[0]][getMan()[1]] = 0;
        arr[0] = arr[0]-1;
        char c = whatNext(arr);
        if (c == '0'){
           gameOver();
        }else if (c == '@') {
            gameWin();
        }else if (c =='F') {
            System.out.println("You Are Attacked By Fire");
            gameOver();
        } else if (c == 'D') {
            System.out.println("You Are Attacked By Dragon");
            gameOver();
        }
        setMan(arr);
    }
    public void moveBottom() {
        int arr[] = getMan();
        board[getMan()[0]][getMan()[1]] = 0;
        arr[0] = arr[0]+1;
        char c = whatNext(arr);
        if (c == '0'){
            gameOver();
        }else if (c == '@') {
            gameWin();
        } else if (c =='F') {
            System.out.println("You Are Attacked By Fire");
            gameOver();
        } else if (c == 'D') {
            System.out.println("You Are Attacked By Dragon");
            gameOver();
        }
        setMan(arr);
    }
    public void moveLeft() {
        int arr[] = getMan();
        board[getMan()[0]][getMan()[1]] = 0;
        arr[1] = arr[1]+1;
        char c = whatNext(arr);
        if (c == '0'){
            gameOver();
        }else if (c == '@') {
            gameWin();
        }else if (c =='F') {
            System.out.println("You Are Attacked By Fire");
            gameOver();
        } else if (c == 'D') {
            System.out.println("You Are Attacked By Dragon");
            gameOver();
        }
        setMan(arr);
    }
    public void moveRight() {
        int arr[] = getMan();
        board[getMan()[0]][getMan()[1]] = 0;
        arr[1] = arr[1]-1;
        char c = whatNext(arr);
        if (c == '0'){
            gameOver();
        } else if (c == '@') {
            gameWin();
        }else if (c =='F') {
            System.out.println("You Are Attacked By Fire");
            gameOver();
        } else if (c == 'D') {
            System.out.println("You Are Attacked By Dragon");
            gameOver();
        }
        setMan(arr);
    }

    private void gameWin() {
        System.out.println("Congratulation");
        System.out.println("You Won the Game");
        System.out.println("Please Refresh and play Another Game");
    }

    public void setBomb() {

    }
}
