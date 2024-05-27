package com.akash.giftcard.template;

import java.util.ArrayList;
import java.util.List;

public class GiftCard {

    private static int cardId = 20001;

    public GiftCard(){
        setGiftCardNo(cardId);
        setActive(true);
        purchaseHistory = new ArrayList<>();
        topUpAmount = 0;
    }
    private int giftCardNo;
    private int pinNo;
    private double topUpAmount;
    private boolean isActive;
    private List<String> purchaseHistory;

    public int getGiftCardNo() {
        return giftCardNo;
    }

    public void setGiftCardNo(int giftCardNo) {
        this.giftCardNo = giftCardNo;
    }

    public int getPinNo() {
        return pinNo;
    }

    public void setPinNo(int pinNo) {
        this.pinNo = pinNo;
    }

    public double getTopUpAmount() {
        return topUpAmount;
    }

    public void setTopUpAmount(double topUpAmount) {
        this.topUpAmount += topUpAmount;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public List<String> getPurchaseHistory() {
        return purchaseHistory;
    }

    public void setPurchaseHistory(List<String> purchaseHistory) {
        this.purchaseHistory = purchaseHistory;
    }
}
