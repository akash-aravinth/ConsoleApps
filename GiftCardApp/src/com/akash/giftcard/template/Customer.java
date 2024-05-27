package com.akash.giftcard.template;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private static long acNo = 100001;

    public Customer(){
        setAccountNumber(acNo++);
        giftCardList = new ArrayList<>();
    }
    private String customerName;
    private long accountNumber;
    private double initialAmount;
    private String password;

    public List<GiftCard> getGiftCardList() {
        return giftCardList;
    }

    private List<GiftCard> giftCardList;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getInitialAmount() {
        return initialAmount;
    }

    public void setInitialAmount(double initialAmount) {
        this.initialAmount += initialAmount;
    }

    public String getPassword() {
        String pass = "";
        for (int i=0;i<password.length();i++){
            char c = password.charAt(i);
            if (Character.isDigit(c)){
                int v = Character.getNumericValue(c)-1;
                String t = Integer.toString(v);
                c = t.charAt(0);
            }
            else if (c == 'A' || c == 'a'){
                if (c == 'A')
                    c = 'Z';
                else
                    c = 'z';
            }else
                c = (char)(c-1);

            pass+=c;
        }
        return pass;
    }

    public void setPassword(String password) {
        String pass = "";
        for (int i=0;i<password.length();i++){
            char c = password.charAt(i);
            if (Character.isDigit(c))
                c = (char)(Character.getNumericValue(c)+1);
            else if (c == 'Z' || c == 'z'){
                if (c == 'Z')
                    c = 'A';
                else
                    c = 'a';
            }else
                c = (char)(c+1);

            pass+=c;
        }
        this.password = pass;
    }
}
