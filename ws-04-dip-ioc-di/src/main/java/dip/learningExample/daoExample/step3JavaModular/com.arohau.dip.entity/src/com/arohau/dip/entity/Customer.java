package com.arohau.dip.entity;

import lombok.Data;

@Data
public class Customer {
    private final String name;

    public Customer(String name) {
        this.name = name;
    }
}
