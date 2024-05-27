package com.akash.giftcard.createaccount;

import com.akash.giftcard.template.Customer;

import java.util.Scanner;

public class CreateAccountView {
    Scanner scanner = new Scanner(System.in);
    private CreateAccountModel createAccountModel;
    public CreateAccountView(){
        createAccountModel = new CreateAccountModel(this);
    }

    public void init(){
        System.out.println("Enter Your Name : ");
        String customerName = scanner.nextLine();
        System.out.println("Enter Your Preference Password Must A-Z.a-z,0-9");
        String password = scanner.next();
        System.out.println("Enter Your Initial Amount");
        double initialAmount = scanner.nextDouble();
        createAccountModel.setupDetails(customerName,password,initialAmount);
    }

    public void showAlert(String s) {
        System.out.println(s);
    }
}
