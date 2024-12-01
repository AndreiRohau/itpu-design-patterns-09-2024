package com.arohau.proxy.ex2;

public class MovieMediaPlayer implements MediaPlayer {

    public MovieMediaPlayer() {
        loadVideo();
    }

    @Override
    public void playMedia() {
        System.out.println("Playing video...");
    }

    private void loadVideo() {
        System.out.println("Loading up large video...");
    }
}
