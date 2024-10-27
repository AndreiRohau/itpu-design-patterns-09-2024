package com.arohau.structural.facade;

public class DVDPlayer {
    public void turnOn() {
        System.out.println("DVDPlayer turnOn");
    }

    public void play(String movie) {
        System.out.println("DVDPlayer play movie = " + movie);
    }

    public void stop() {
        System.out.println("DVDPlayer stop");
    }

    public void turnOff() {
        System.out.println("DVDPlayer turnOff");
    }
}
