package com.arohau.chainOfResponsibility.ex2;

public class WithdrawalRequest {

    private final Double amount;
    private final Currency currency;

    public WithdrawalRequest(double amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Double getAmount() {
        return this.amount;
    }

    public Currency getCurrency() {
        return this.currency;
    }

    public enum Currency {
        USD,
        EUR
    }

}