package com.akash.giftcard.home;


import com.akash.giftcard.createaccount.CreateAccountView;
import com.akash.giftcard.login.LoginView;

public class HomeModel {
    private HomeView homeView;
    public HomeModel(HomeView homeView){
        this.homeView = homeView;
    }

    public void redirect(int choice) {
        if (choice == 1){
            CreateAccountView createAccountView = new CreateAccountView();
            createAccountView.init();
        } else if (choice == 2) {
            LoginView loginView = new LoginView();
            loginView.init();
        }else {
            homeView.showAlert("Please Enter Valid Choice");
            homeView.init();
        }
    }
}
