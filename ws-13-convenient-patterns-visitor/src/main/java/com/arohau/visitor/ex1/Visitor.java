package com.arohau.visitor.ex1;

public interface Visitor {
    void visit(File file);
    void visit(Directory directory);
}
