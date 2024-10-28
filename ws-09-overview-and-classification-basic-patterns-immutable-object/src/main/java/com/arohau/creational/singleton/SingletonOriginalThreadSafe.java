package com.arohau.creational.singleton;

/*
https://medium.com/@cancerian0684/singleton-design-pattern-and-how-to-make-it-thread-safe-b207c0e7e368
 */
public class SingletonOriginalThreadSafe {
    private volatile SingletonOriginalThreadSafe instance;

    /*
    Using localRef, we are reducing the access of volatile variable to just one for positive usecase.
    The volatile keyword ensures that multiple threads handle the singleton instance correctly.
     */
    public SingletonOriginalThreadSafe getInstance() {
        SingletonOriginalThreadSafe localRef = instance;
        if (localRef == null) {
            synchronized (this) {
                localRef = instance;
                if (localRef == null) {
                    instance = localRef = new SingletonOriginalThreadSafe();
                }
            }
        }
        return localRef;
    }

    private static SingletonOriginalThreadSafe instance_;
    // original thread safe approach
    public SingletonOriginalThreadSafe getInstance_() {
        if (instance_ == null) {
            synchronized (this) {
                if (instance_ == null) {
                    instance_ = new SingletonOriginalThreadSafe();
                }
            }
        }
        return instance_;
    }

    // other functions and members...
    public Object doSmth() {
        return "did smth";
    }
}
