package com.arohau.observer.ex1;

public class App {

    public static void main(String[] args) {

        User user1 = new User();
        User user2 = new User();
        Newsfeed newsfeed = new Newsfeed();

        user1.addPropertyChangeListener(newsfeed);
        user2.addPropertyChangeListener(newsfeed);

        user1.setStatus("Going for a walk");
        user2.setStatus("Enjoying a coffee");

        newsfeed.printStatuses();
    }
}
