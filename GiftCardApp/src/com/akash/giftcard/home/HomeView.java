package com.akash.giftcard.home;

import java.util.Scanner;

public class HomeView {
    Scanner scanner = new Scanner(System.in);
    private HomeModel homeModel;
    public HomeView(){
        homeModel = new HomeModel(this);
    }

    public void init(){
        System.out.println("Here You Can Login And SignUp \n" +
                "Do You Have Account Then Login First\n" +
                "Don't Have an Account then Create Account\n" +
                "Press 1 For Create Account\n" +
                "Press 2 For Login Account");
        int choice = scanner.nextInt();
        homeModel.redirect(choice);
    }

    public void showAlert(String alert) {
        System.out.println(alert);
    }

}
