package com.arohau.visitor.ex2;

public class Main {

    public static void main(String[] args) {
        var groupTicket = new GroupTicket();
        var ticket1 = new AdultTicket(110); // 99
        var ticket2 = new AdultTicket(1000); // 900
        groupTicket.addElement(ticket1);
        groupTicket.addElement(ticket2);

        System.out.println("Price: " + groupTicket.getPrice()); // 1110

        var discountVisitor = new DiscountVisitor();
        groupTicket.accept(discountVisitor);

        System.out.println("Price: " + groupTicket.getPrice()); // 999
    }

}
