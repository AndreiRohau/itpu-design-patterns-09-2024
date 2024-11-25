package com.arohau.visitor.ex3;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
