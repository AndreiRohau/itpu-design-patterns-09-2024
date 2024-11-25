package com.arohau.visitor.ex2;

public interface TicketElement {
    int getPrice();
    void accept(Visitor visitor);
}
