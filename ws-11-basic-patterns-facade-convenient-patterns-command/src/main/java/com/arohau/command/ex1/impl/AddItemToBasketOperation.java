package com.arohau.command.ex1.impl;

import com.arohau.command.ex1.Item;
import com.arohau.command.ex1.ItemOperation;

public class AddItemToBasketOperation implements ItemOperation {

    private final Item item;

    public AddItemToBasketOperation(Item item) {
        this.item = item;
    }

    @Override
    public void execute() {
        item.addToBasket();
    }
}