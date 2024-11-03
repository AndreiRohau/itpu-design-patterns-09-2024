package com.arohau.factoryMethod.ex1;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class TicketMachine {
    private static final Map<String, Supplier<Ticket>> ticketMap = new HashMap<>();
    static {
        ticketMap.put("bus", BusTicket::new);
        ticketMap.put("train", TrainTicket::new);
    }

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
