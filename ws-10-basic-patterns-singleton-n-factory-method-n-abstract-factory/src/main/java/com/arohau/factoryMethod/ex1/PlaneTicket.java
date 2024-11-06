package com.arohau.factoryMethod.ex1;

public class PlaneTicket implements Ticket {
    @Override
    public String getTicketType() {
        return "A valid Plane Ticket";
    }

    @Override
    public int getPrice() {
        return 120;
    }
}
