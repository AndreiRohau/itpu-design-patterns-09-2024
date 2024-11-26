package com.arohau.visitor.ex2;

public class DiscountVisitor implements Visitor {

    private final int percentOfDiscount = 10;

    @Override
    public void visit(AdultTicket ticket) {
        ticket.setPrice(applyDiscount(ticket.getPrice()));
    }

    private int applyDiscount(int price) {
        return price * (100 - percentOfDiscount) / 100;
    }

    @Override
    public void visit(GroupTicket ticket) {
        ticket.getElements().forEach(element -> element.accept(this));
    }
}
