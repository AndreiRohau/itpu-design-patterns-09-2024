package com.arohau.structural.facade;

// Facade class
public class HomeTheaterFacadeImpl implements HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Television television;
    private SoundSystem soundSystem;

    public HomeTheaterFacadeImpl(DVDPlayer dvdPlayer, Television television, SoundSystem soundSystem) {
        this.dvdPlayer = dvdPlayer;
        this.television = television;
        this.soundSystem = soundSystem;
    }

    public void watchMovie(String movie) {
        dvdPlayer.turnOn();
        dvdPlayer.play(movie);
        television.turnOn();
        television.setInput("DVD");
        soundSystem.turnOn();
        soundSystem.setVolume(10);
    }

    public void endMovie() {
        dvdPlayer.stop();
        dvdPlayer.turnOff();
        television.turnOff();
        soundSystem.turnOff();
    }

    public void listenToMusic() {
        soundSystem.turnOn();
        soundSystem.setVolume(20);
    }

    public void stopMusic() {
        soundSystem.turnOff();
    }
}
