package com.arohau.srp.product.correct;

import lombok.Data;

@Data
public class Product {
    private final String title;
    private final Double price;
    private final Double taxRate;

    public Product(String title, Double price, Double taxRate) {
        this.title = title;
        this.price = price;
        this.taxRate = taxRate;
    }
}
