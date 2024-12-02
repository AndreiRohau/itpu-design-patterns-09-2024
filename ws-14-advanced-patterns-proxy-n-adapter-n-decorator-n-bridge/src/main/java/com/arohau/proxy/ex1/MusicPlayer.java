package com.arohau.proxy.ex1;

/*
    proxy

    - check access
    - add lazy load for the service

 */
public class MusicPlayer {

    private static final RecommendationsProxy recommendationsProxy = new RecommendationsProxy();

    public static void main(String[] args) {
        boolean isPremium = true;
        User user = new User("Jill", isPremium);
        loadHomePage(user);
        loadDiscoverPage(user);
    }

    private static void loadHomePage(User user) {
        System.out.println("Loading home page...");
        recommendationsProxy.showRecommendations(user);
    }

    private static void loadDiscoverPage(User user) {
        System.out.println("Loading discover page...");
        recommendationsProxy.showRecommendations(user);
    }
}
