package com.akash.railway.createTrain;

import com.akash.railway.model.Train;
import com.akash.railway.model.TrainApp;

public class CreateTrainModel {
    private CreateTrainView createTrainView;
    public CreateTrainModel(CreateTrainView createTrainView){
        this.createTrainView = createTrainView;
    }

    public void ctreateTrain(int noOfTRains, double ticketPrice, int noOfCompartments) {
        TrainApp trainApp = new TrainApp();
        for (int i=0;i<noOfTRains;i++){
            Train train = new Train();
            train.setTrainId(i);
            train.setAcTicket(noOfCompartments);
            train.setSeaterTicket(noOfCompartments);
            train.setNonAcTicket(noOfCompartments);
            train.setTicketPrice(ticketPrice);
            trainApp.getTrainList().add(train);
        }
        createTrainView.showAlert("Train Create Successfully");
    }
}
