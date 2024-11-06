package com.arohau.creational.singleton;

/*
https://medium.com/@cancerian0684/singleton-design-pattern-and-how-to-make-it-thread-safe-b207c0e7e368
1. one instance
2. lazy loading
3. thread safety
 */
public class SingletonOriginalThreadSafe {
    private static volatile SingletonOriginalThreadSafe INSTANCE;
    private SingletonOriginalThreadSafe(){}
    /*
    Using localRef, we are reducing the access of volatile variable to just one for positive usecase.
    The volatile keyword ensures that multiple threads handle the singleton instance correctly.
     */
    public static SingletonOriginalThreadSafe getInstance() {
        SingletonOriginalThreadSafe localRef = INSTANCE;
        if (localRef == null) {
            synchronized (SingletonOriginalThreadSafe.class) {
                localRef = INSTANCE;
                if (localRef == null) {
                    INSTANCE = localRef = new SingletonOriginalThreadSafe();
                }
            }
        }
        return localRef;
    }

    private static SingletonOriginalThreadSafe instance_;
    // original thread safe approach
    public static SingletonOriginalThreadSafe getInstance_() {
        if (instance_ == null) {
            synchronized (SingletonOriginalThreadSafe.class) {
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
