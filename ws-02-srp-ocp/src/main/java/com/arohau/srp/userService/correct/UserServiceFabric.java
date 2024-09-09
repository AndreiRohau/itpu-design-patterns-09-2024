package com.arohau.srp.userService.correct;

public class UserServiceFabric {

    private static UserService userService = null;

    public static UserService getUserServiceInstance() {
        synchronized (userService) {
            if (userService == null) {
                userService = new UserService(() -> {
                });
            }
        }
        return userService;
    }
}
