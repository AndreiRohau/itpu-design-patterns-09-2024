package com.arohau.observer.ex4;

public class Main {
    public static void main(String[] args) {
        ONewsAgency observable = new ONewsAgency();
        ONewsChannel observer = new ONewsChannel();

        observable.addObserver(observer);
        final String news = "some hot news";
        observable.setNews(news);

        System.out.println(observer.getNews().equals(news));
    }
}
