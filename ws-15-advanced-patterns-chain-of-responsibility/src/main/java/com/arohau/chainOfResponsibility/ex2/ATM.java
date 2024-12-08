package com.arohau.chainOfResponsibility.ex2;

public abstract class ATM {

    public ATM nextATM;

    public ATM(ATM nextATM) {
        this.nextATM = nextATM;
    }

    public abstract void dispense(WithdrawalRequest request);

}
