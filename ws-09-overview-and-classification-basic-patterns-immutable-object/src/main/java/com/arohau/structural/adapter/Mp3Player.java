package com.arohau.structural.adapter;

public class Mp3Player implements MediaPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("Playing MP3 file: " + fileName);
    }
}
