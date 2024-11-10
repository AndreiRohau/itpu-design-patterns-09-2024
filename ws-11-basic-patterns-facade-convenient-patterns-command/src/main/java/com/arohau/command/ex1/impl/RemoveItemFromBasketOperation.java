package com.arohau.command.ex1.impl;

import com.arohau.command.ex1.Item;
import com.arohau.command.ex1.ItemOperation;

public class RemoveItemFromBasketOperation implements ItemOperation {

    private final Item item;

    public RemoveItemFromBasketOperation(Item item) {
        this.item = item;
    }

    @Override
    public void execute() {
        item.removeFromBasket();
    }
}
