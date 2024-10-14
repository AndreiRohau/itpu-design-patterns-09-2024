package com.arohau.ex4.refactored;

public class User {
    private int id;
    private int username;
    private int password;

    public void save(UserRepository userRepository) {
        userRepository.save(this);
    }
}
