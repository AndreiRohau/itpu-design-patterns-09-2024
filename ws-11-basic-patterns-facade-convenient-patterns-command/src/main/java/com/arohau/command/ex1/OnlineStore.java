package com.arohau.command.ex1;

import com.arohau.command.ex1.impl.AddItemToBasketOperation;
import com.arohau.command.ex1.impl.RemoveItemFromBasketOperation;

public class OnlineStore {

    public static void main(String[] args) {
        var item1 = new Item(1);
        var item2 = new Item(2);
        var item3 = new Item(3);

        ItemOperationExecutor itemOperationExecutor = new ItemOperationExecutor();

        itemOperationExecutor.doOperation(new AddItemToBasketOperation(item1));
        itemOperationExecutor.doOperation(new AddItemToBasketOperation(item2));
        itemOperationExecutor.doOperation(new AddItemToBasketOperation(item3));
        itemOperationExecutor.doOperation(new RemoveItemFromBasketOperation(item2));

        // queue

        itemOperationExecutor.queueOperation(new AddItemToBasketOperation(item1));
        itemOperationExecutor.queueOperation(new AddItemToBasketOperation(item2));
        itemOperationExecutor.queueOperation(new AddItemToBasketOperation(item3));
        itemOperationExecutor.queueOperation(new RemoveItemFromBasketOperation(item2));

        itemOperationExecutor.checkout();
    }
}
