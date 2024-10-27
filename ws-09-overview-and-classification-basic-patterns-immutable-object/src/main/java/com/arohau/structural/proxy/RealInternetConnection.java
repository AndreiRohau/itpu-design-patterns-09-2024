package com.arohau.structural.proxy;

// Real subject class
public class RealInternetConnection implements InternetConnection {
    public void connect(String website) {
        System.out.println("Connecting to website: " + website);
    }
}
