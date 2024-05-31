package com.akash.railway.createTrain;

import java.util.Scanner;

public class CreateTrainView {
    Scanner scanner = new Scanner(System.in);
    private CreateTrainModel createTrainModel;
    public CreateTrainView(){
        createTrainModel = new CreateTrainModel(this);
    }
    public void init(){
        System.out.println("Enter No Of Trains You Want");
        int noOfTRains = scanner.nextInt();
        System.out.println("Enter No Of Seats You Wants in Each Compartment");
        int noOfCompartments = scanner.nextInt();
        System.out.println("Enter The Ticket Price : ");
        double ticketPrice = scanner.nextDouble();
        createTrainModel.ctreateTrain(noOfTRains,ticketPrice,noOfCompartments);
    }

    public void showAlert(String train_create_successfully) {
        System.out.println(train_create_successfully);
    }
}
