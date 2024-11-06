package com.arohau.singleton.ex1;

import lombok.Data;

@Data
public class User {

    private static volatile User INSTANCE;

    private String name;
    private String email;
    private String country;

    private User(String name, String email, String country) {
        this.name = name;
        this.email = email;
        this.country = country;
    }

    public static User getSingletonInstance(String name, String email, String country) {
        if (INSTANCE == null) {
            synchronized (User.class) {
                if (INSTANCE == null) {
                    INSTANCE = new User(name, email, country);
                }
            }
        }
        return INSTANCE;
    }
}

