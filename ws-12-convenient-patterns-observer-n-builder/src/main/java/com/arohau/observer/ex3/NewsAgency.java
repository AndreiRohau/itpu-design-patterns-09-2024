package com.arohau.observer.ex3;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private String news;
    private List<Channel> subscribers = new ArrayList<>(); // observers

    public void addObserver(Channel channel) {
        this.subscribers.add(channel);
    }

    public void removeObserver(Channel channel) {
        this.subscribers.remove(channel);
    }

    public void setNews(String news) {
        this.news = news;
        for (Channel subscriber : this.subscribers) {
            subscriber.update(this.news);
        }
    }
}
