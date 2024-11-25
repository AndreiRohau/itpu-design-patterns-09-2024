package com.arohau.visitor.ex1;

public interface FileSystemElement {
    String getName();
    void accept(Visitor visitor);
}
