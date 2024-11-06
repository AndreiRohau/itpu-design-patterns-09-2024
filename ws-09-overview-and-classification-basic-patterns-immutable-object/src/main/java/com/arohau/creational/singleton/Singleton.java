package com.arohau.creational.singleton;

public class Singleton {
    private Singleton() {}

    /*
    private static class SingletonHolder {
        public static final Singleton INSTANCE = new Singleton();
    }
     */

    private static class SingletonHolder {
        public static final Singleton INSTANCE;
        static {
            System.out.println("here");
            INSTANCE = new Singleton();
        }
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public Object doSomething() {
        return "work is done";
    }
}
