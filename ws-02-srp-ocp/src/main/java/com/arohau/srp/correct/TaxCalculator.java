package com.arohau.srp.correct;

public class TaxCalculator {
    public Double calculateTax(Product product) {
        return product.getPrice() * product.getTaxRate();
    }
}
