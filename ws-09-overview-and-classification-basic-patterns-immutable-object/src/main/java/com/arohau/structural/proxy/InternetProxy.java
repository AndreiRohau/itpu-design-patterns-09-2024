package com.arohau.structural.proxy;

import java.util.HashSet;
import java.util.Set;

// Proxy class
public class InternetProxy implements InternetConnection {
    private RealInternetConnection realInternetConnection;
    private Set<String> allowedWebsites;

    public InternetProxy() {
        realInternetConnection = new RealInternetConnection();
        allowedWebsites = new HashSet<>();
        allowedWebsites.add("example.com");
        allowedWebsites.add("google.com");
    }

    public void connect(String website) {
        if (allowedWebsites.contains(website)) {
            realInternetConnection.connect(website);
        } else {
            System.out.println("Access to website " + website + " is not allowed.");
        }
    }
}
