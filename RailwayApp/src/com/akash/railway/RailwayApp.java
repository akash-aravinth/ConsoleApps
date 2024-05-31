package com.akash.railway;

public class RailwayApp {
    private static RailwayApp railwayApp;
    public static RailwayApp getInstance(){
        if (railwayApp == null){
            railwayApp = new RailwayApp();
        }
        return railwayApp;
    }
    private String appName = "Railway Ticket Reservation App";
    private String appVersion = "1.0.1";
    public void init(){
        System.out.println("Welcome To : "+appName);
        System.out.println("And The Version Is : "+appVersion);
        startApp();
    }

    private void startApp() {

    }

    public static void main(String[] args) {
        RailwayApp.getInstance().init();
    }
}
