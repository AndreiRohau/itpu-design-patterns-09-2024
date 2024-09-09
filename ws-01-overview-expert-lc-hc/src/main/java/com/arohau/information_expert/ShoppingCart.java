package com.arohau.information_expert;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ShoppingCart {
    private List<Product> products = new ArrayList<>();

    public void addProductToCart(Product product) {
        products.add(product);
    }

    /**
     * Information_expert states, that total price calculation should be
     * implemented in class, which has all required data for such operation: list of products in cart
     * @param discount loyalty program
     * @return total price
     */
    public Double getTotalPrice(final Double discount) {
        return discount * products.stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }
}
