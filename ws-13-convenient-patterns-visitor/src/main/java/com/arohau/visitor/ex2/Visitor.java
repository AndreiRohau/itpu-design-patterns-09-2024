package com.arohau.visitor.ex2;

public interface Visitor {
    void visit(AdultTicket ticket);
    void visit(GroupTicket ticket);
}
