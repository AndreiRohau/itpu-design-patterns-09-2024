package com.arohau.observer.ex4;

import java.util.Observable;

public class ONewsAgency extends Observable {
    private String news;

    public void setNews(String news) {
        this.news = news;
        setChanged();
        notifyObservers(this.news);
    }
}
