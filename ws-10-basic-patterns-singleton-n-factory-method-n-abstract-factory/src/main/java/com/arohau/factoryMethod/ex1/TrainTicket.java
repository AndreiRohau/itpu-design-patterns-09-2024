package com.arohau.factoryMethod.ex1;

public class TrainTicket implements Ticket {
    @Override
    public String getTicketType() {
        return "A Valid Train Ticket";
    }

    @Override
    public int getPrice() {
        return 7;
    }
}
