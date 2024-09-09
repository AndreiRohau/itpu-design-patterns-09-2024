package com.arohau.srp.correct;

/**
 * Now Product class is responsible only for data storing and
 * class TaxCalculator is responsible only for data processing
 */
public class Main {
    public static void main(String[] args) {
        Product cup = new Product("a nice cup", 55.0, 0.1);
        TaxCalculator taxCalculator = new TaxCalculator();
        System.out.println("cup tax is " + taxCalculator.calculateTax(cup));

    }
}
