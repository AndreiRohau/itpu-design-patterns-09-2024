package com.arohau.structural.adapter;

public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    public void play(String fileName) {
        if (fileName.endsWith(".mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
