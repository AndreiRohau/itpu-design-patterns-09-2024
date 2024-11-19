package com.arohau.observer.ex3;

public class Main {
    public static void main(String[] args) {
        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();

        observable.addObserver(observer);
        final String news = "we got some hot news for you";
        observable.setNews(news);

        System.out.println(observer.getNews().equals(news));
    }
}
