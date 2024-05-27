package com.akash.giftcard.startapp;

import com.akash.giftcard.template.Customer;
import com.akash.giftcard.template.GiftCard;

import java.time.LocalDateTime;
import java.util.List;

public class RunModel {
    private RunView runView;
    RunModel(RunView runView){
        this.runView = runView;
    }
    public void gettingGiftCard(Customer customer, int pin) {
        GiftCard giftCard = new GiftCard();
        giftCard.setPinNo(pin);
        customer.getGiftCardList().add(giftCard);
        runView.showAlert("GiftCard Create Successfully");
    }

    public void giveTopUpCard(Customer customer, int cardNo, int pinNo, double topup) {
       if (customer.getInitialAmount() > topup){
           for (GiftCard g : customer.getGiftCardList()){
               if (cardNo == g.getGiftCardNo()){
                   if (pinNo == g.getPinNo()){
                       topupAmount(customer,g,topup);
                   }else {
                       /////
                   }
               }
           }
           ///////
       }else{
           runView.showAlert("Insufficient Balance in Your Account Please Update Your Main Account");
           runView.init(customer);
       }
    }

    private void topupAmount(Customer customer, GiftCard g, double topup) {
        String s = topup+"Amount recharged"+ LocalDateTime.now()+"";
        customer.setInitialAmount(-topup);
        g.setTopUpAmount(topup);
        g.getPurchaseHistory().add(s);
        runView.init(customer);
    }

    public void getHistory(Customer customer) {
        for (GiftCard s : customer.getGiftCardList()){
            runView.showAlert("Your Card Number Is : "+s.getGiftCardNo());
            runView.showAlert("Your Transaction and Purchase History's are : ");
            for(String h : s.getPurchaseHistory()){
                System.out.println(h);
            }
        }
    }

    public void blockCard(Customer customer, int cardNo) {
        GiftCard giftCard = null;
        for (GiftCard c : customer.getGiftCardList()){
            if (c.getGiftCardNo() == cardNo){
                giftCard = c;
            }
        }
        if (giftCard == null){
            runView.showAlert("Please Enter Valid GiftCardNo : ");
            runView.init(customer);
        }
        double amount = giftCard.getTopUpAmount();
        customer.setInitialAmount(amount);
        giftCard.setTopUpAmount(-giftCard.getTopUpAmount());
        giftCard.setActive(false);
        runView.showAlert("Card has Been Blocked");
    }
}
