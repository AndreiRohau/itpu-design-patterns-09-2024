package com.arohau.srp.product;

/**
 * here Product class is responsible for data storing and data processing
 */
public class Main {
    public static void main(String[] args) {
        Product cup = new Product("a nice cup", 55.0, 0.1);
        System.out.println("cup tax is " + cup.calculateTax());

    }
}
