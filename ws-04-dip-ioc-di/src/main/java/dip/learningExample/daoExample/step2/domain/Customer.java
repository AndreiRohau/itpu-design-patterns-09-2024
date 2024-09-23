package dip.learningExample.daoExample.step2.domain;

import lombok.Data;

@Data
public class Customer {
    private String name;

    public Customer() {
    }

    public Customer(String name) {
        this.name = name;
    }
}
