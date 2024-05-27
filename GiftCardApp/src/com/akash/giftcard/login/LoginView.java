package com.akash.giftcard.login;

import java.util.Scanner;

public class LoginView {
    Scanner scanner = new Scanner(System.in);
    LoginModel loginModel;
    public LoginView(){
        loginModel = new LoginModel(this);
    }

    public void init(){
        System.out.println("Enter Your AccountNo : ");
        long acNo = scanner.nextLong();
        System.out.println("Enter Your Password : ");
        String password = scanner.next();
        loginModel.isCorrectUser(acNo,password);
    }
    public void showAlert(String alert){
        System.out.println(alert);
    }

}
