package com.arohau.creational.singleton;

public class Singleton {
    private Singleton() {}

    private static class SingletonHolder {
        public static final Singleton instance;
        static {
            System.out.println("here");
            instance = new Singleton();
        }
    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }

    public Object doSomething() {
        return "work is done";
    }
}
