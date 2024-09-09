package com.arohau.srp.userService.correct;

public class UserService {
    
    private PasswordComplexityValidator passwordComplexityValidator;

    protected UserService(PasswordComplexityValidator passwordComplexityValidator) {
        this.passwordComplexityValidator = passwordComplexityValidator;
    }

    public void create(String[] args) {
        // password complexity validation
        // save user
        saveToDatabse();
    }
    public void read(String[] args) {
        // get user
    }
    public void update(String[] args) {
        // password complexity validation
        // mutate user
    }
    public void delete(String[] args) {
        // remove user
    }

    // this part shall be moved out of this class, since this class should not be responsible for such features

    // non-complient with SRP, since UserService is responsible for User Data lifecycle
    private void validatePasswordComplexity() {
        // validate password complexity
    }
    
    // non-complient with SRP, since UserService is responsible for User Data lifecycle
    private void saveToDatabse() {
        getConnectionToDatabase();
        // validate password complexity
    }

    // non-complient with SRP, since UserService is responsible for User Data lifecycle
    private void getConnectionToDatabase() {
    }
}
