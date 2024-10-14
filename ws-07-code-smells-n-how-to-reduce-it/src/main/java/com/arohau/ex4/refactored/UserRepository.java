package com.arohau.ex4.refactored;

public interface UserRepository {
    void save(User user);
    User getById(int id);
}
