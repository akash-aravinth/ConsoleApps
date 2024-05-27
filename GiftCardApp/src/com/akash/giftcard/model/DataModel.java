package com.akash.giftcard.model;

import com.akash.giftcard.template.Customer;

import java.util.ArrayList;
import java.util.List;

public class DataModel {
    private static DataModel dataModel;
    public static DataModel getInstance(){
        if (dataModel == null){
            dataModel = new DataModel();
        }
        return dataModel;
    }

    List<Customer> customerList = new ArrayList<>();

    public void addCustomer(Customer customer){
        customerList.add(customer);
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }
}
