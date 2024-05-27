package com.akash.giftcard.createaccount;

import com.akash.giftcard.home.HomeView;
import com.akash.giftcard.model.DataModel;
import com.akash.giftcard.template.Customer;

public class CreateAccountModel {
    private CreateAccountView createAccountView;
    public CreateAccountModel(CreateAccountView createAccountView){
        this.createAccountView = createAccountView;
    }


    public void setupDetails(String customerName, String password, double initialAmount) {
        Customer customer = new Customer();
        customer.setCustomerName(customerName);
        customer.setPassword(password);
        customer.setInitialAmount(initialAmount);
        DataModel.getInstance().addCustomer(customer);
        createAccountView.showAlert("Customer Add SuccessFully\nNow You Can Choose Login and login your account");
        System.out.println("Your Account No is : "+customer.getAccountNumber());
        HomeView homeView = new HomeView();
        homeView.init();
    }
}
