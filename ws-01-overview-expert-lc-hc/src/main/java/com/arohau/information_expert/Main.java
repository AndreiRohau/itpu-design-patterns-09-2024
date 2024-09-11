package com.arohau.information_expert;

/**
Information expert

Problem: What is a basic principle by which to assign responsibilities to objects?
Solution: Assign responsibility to the class that has the information needed to fulfill it.

 TIP: find Object that is connected to the responsibility and has enough resources to perform such responsibility
 Supports Low coupling
 */
public class Main {
    public static void main(String[] args) {
        Product iphone = new Product("iphone", "phone", 1000.0);
        Product ipad = new Product("ipad", "tablet", 2000.0);
        Product makbook = new Product("makbook", "laptop", 3000.0);

        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addProductToCart(iphone);
        shoppingCart.addProductToCart(ipad);
        shoppingCart.addProductToCart(makbook);

        Double totalPrice = shoppingCart.getTotalPrice(1.0);

        System.out.println(totalPrice);
    }
}
