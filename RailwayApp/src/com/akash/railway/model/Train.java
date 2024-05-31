package com.akash.railway.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Train {
    private int trainId;
    private int acTicket;
    private int nonAcTicket;
    private int seaterTicket;
    private Queue<User> waitingList;
    private List<User> bookings;

    private double ticketPrice;

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public Train(){
        waitingList = new LinkedList<>();
        bookings = new ArrayList<>();
    }

    public int getTrainId() {
        return trainId;
    }

    public void setTrainId(int trainId) {
        this.trainId = trainId;
    }

    public int getAcTicket() {
        return acTicket;
    }

    public void setAcTicket(int acTicket) {
        this.acTicket = acTicket;
    }

    public int getNonAcTicket() {
        return nonAcTicket;
    }

    public void setNonAcTicket(int nonAcTicket) {
        this.nonAcTicket = nonAcTicket;
    }

    public int getSeaterTicket() {
        return seaterTicket;
    }

    public void setSeaterTicket(int seaterTicket) {
        this.seaterTicket = seaterTicket;
    }

    public Queue<User> getWaitingList() {
        return waitingList;
    }

    public void setWaitingList(Queue<User> waitingList) {
        this.waitingList = waitingList;
    }

    public List<User> getBookings() {
        return bookings;
    }

    public void setBookings(List<User> bookings) {
        this.bookings = bookings;
    }
}
