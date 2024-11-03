package com.arohau.factoryMethod.ex1;

public class TicketOffice {
    private static final TicketMachine ticketMachine = new TicketMachine();

    public static void main(String[] args) {
//        buyATicket("bus");
//        buyATicket("train");

        buyABusTicket();
        buyATrainTicket();
    }

//    private static void buyATicket(String type) {
//        Ticket ticket = ticketMachine.createTicket(type);
//        System.out.println("One " + type + " ticket is purchased. The price is $" + ticket.getPrice() + ".");
//    }

    private static void buyABusTicket() {
        Ticket ticket = ticketMachine.createTicket("bus");
        System.out.println("One bus ticket is purchased. The price is $" + ticket.getPrice() + ".");
    }

    private static void buyATrainTicket() {
        Ticket ticket = ticketMachine.createTicket("train");
        System.out.println("One train ticket is purchased. The price is $" + ticket.getPrice() + ".");
    }
}
