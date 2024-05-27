package com.akash.giftcard.startapp;

import com.akash.giftcard.home.HomeView;
import com.akash.giftcard.template.Customer;

import java.util.Scanner;

public class RunView {
    Scanner scanner = new Scanner(System.in);
    private RunModel runModel;
    public RunView(){
        runModel = new RunModel(this);
    }
    public void init(Customer customer){
        System.out.println("Enter The Correct Choice");
        System.out.println("1 --> Create Gift Card\n2 --> Top Up the Card\n3 --> Transaction History\n" +
                "4 --> Block The Card\n5 -- > LogOut");
        int choice = scanner.nextInt();
        switch (choice){
            case 1 : {
                createGiftCard(customer);
                break;
            }
            case 2 : {
                topUpCard(customer);
                System.out.println("TopUp SuccessFully");
                break;
            }
            case 3 :{
                showHistory(customer);
                break;
            }
            case 4 : {
                blockCard(customer);
                break;
            }
            case 5 : {
                logout();
                break;
            }
            default:{
                System.out.println("Please Enter Valid Option");
                init(customer);
                break;
            }
        }
    }

    private void logout() {
        HomeView homeView = new HomeView();
        homeView.init();
    }

    private void blockCard(Customer customer) {
        System.out.println("Enter The Card Number : ");
        int cardNo = scanner.nextInt();
        runModel.blockCard(customer,cardNo);
        init(customer);
    }

    private void showHistory(Customer customer) {
        System.out.println("Here Your History is : ");
        runModel.getHistory(customer);
        init(customer);
    }

    private void topUpCard(Customer customer) {
        System.out.println("Enter Card Number : ");
        int cardNo = scanner.nextInt();
        System.out.println("Enter Card Pin Number");
        int pinNo = scanner.nextInt();
        System.out.println("Please Enter Amount You Want's to TopUp : ");
        double topup = scanner.nextDouble();
        runModel.giveTopUpCard(customer,cardNo,pinNo,topup);
    }

    public void createGiftCard(Customer customer) {
        System.out.println("Setting a Pin with 5 digits");
        int pin = scanner.nextInt();
        runModel.gettingGiftCard(customer,pin);
        init(customer);
    }

    public void showAlert(String s) {
        System.out.println(s);
    }
}
