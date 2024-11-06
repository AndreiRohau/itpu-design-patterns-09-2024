package com.arohau.factoryMethod.ex1;

import java.util.Map;
import java.util.function.Supplier;

// Factory method design pattern: Factory for tickets
public class TicketMachine {
    private static final Map<String, Supplier<Ticket>> ticketMap = Map.of(
            "bus", BusTicket::new,
            "train", TrainTicket::new,
            "plane", PlaneTicket::new
    );

    public Ticket createTicket(String type) {
        Ticket ticket;
        if (ticketMap.get(type) != null) {
            ticket = ticketMap.get(type).get();
        } else {
            throw new IllegalArgumentException("Invalid ticket type.");
        }
        return ticket;
    }
}
