package com.arohau.ex1.refactored;

public class CheckoutController {

    public void processOrder(Object order) {
        double totalAmount = calculateTotalAmount(order);
        double discountedAmount = applyDiscounts(totalAmount, order);
        processPayment(discountedAmount, order);
        sendConfirmationEmails(order);
        updateInventory(order);
        updateOrderStatus(order);
    }

    private double calculateTotalAmount(Object order) {
        return 0;
    }

    private double applyDiscounts(double totalAmount, Object order) {
        return 0;
    }

    private void processPayment(double discountedAmount, Object order) {
    }

    private void sendConfirmationEmails(Object order) {
    }

    private void updateInventory(Object order) {
    }

    private void updateOrderStatus(Object order) {
    }
}
