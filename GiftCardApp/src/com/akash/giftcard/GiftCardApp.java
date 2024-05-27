package com.akash.giftcard;

import com.akash.giftcard.home.HomeView;

public class GiftCardApp {

    private static GiftCardApp giftCardApp;
    private static GiftCardApp getInstance(){
        if(giftCardApp == null){
            giftCardApp = new GiftCardApp();
        }
        return giftCardApp;
    }
    private String appName = "Gift Card App";
    private  String appVersion = "0.0.1";

    public String getAppName() {
        return appName;
    }

    public String getAppVersion() {
        return appVersion;
    }
    private void init(){
        System.out.println("Welcome to "+getAppName() +"\nAnd the Version is "+ getAppVersion());
        HomeView homeView = new HomeView();
        homeView.init();
    }

    public static void main(String[] args) {
        GiftCardApp.getInstance().init();
    }
}
