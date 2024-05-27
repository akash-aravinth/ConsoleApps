package com.akash.giftcard.login;

import com.akash.giftcard.model.DataModel;
import com.akash.giftcard.startapp.RunView;
import com.akash.giftcard.template.Customer;

import java.util.ArrayList;
import java.util.List;

public class LoginModel {
    private LoginView loginView;
    LoginModel(LoginView loginView){
        this.loginView = loginView;
    }

    public void isCorrectUser(long acNo, String password) {
        for (Customer c : DataModel.getInstance().getCustomerList()){
            if (c.getAccountNumber() == acNo){
                if (c.getPassword().equals(password)){
                    giveAccess(c);
                }else {
                    loginView.showAlert("Please Enter Valid Password");
                    loginView.init();
                }
            }else {
                loginView.showAlert("Please Enter Valid UserName");
                loginView.init();
            }
        }
    }

    public void giveAccess(Customer c) {
        RunView runView = new RunView();
        runView.init(c);
    }
}
