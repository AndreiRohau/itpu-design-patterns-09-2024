package com.arohau.srp;

public class Product {
    private final String title;
    private final Double price;
    private final Double taxRate;

    public Product(String title, Double price, Double taxRate) {
        this.title = title;
        this.price = price;
        this.taxRate = taxRate;
    }
    public Double calculateTax() {
        return this.price * this.taxRate;
    }
}
