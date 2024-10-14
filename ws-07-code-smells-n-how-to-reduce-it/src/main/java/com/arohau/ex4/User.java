package com.arohau.ex4;

public class User {
    private int id;
    private int username;
    private int password;

    public void save() {
        Database.saveUser(this);
    }

    public static User getById(int id) {
        return Database.getUserById(id);
    }
}
