package com.arohau.command.ex1;

import java.util.ArrayList;
import java.util.List;

public class ItemOperationExecutor {

    // common approach
    public void doOperation(ItemOperation itemOperation) {
        itemOperation.execute();
    }

    // queue approach
    List<ItemOperation> itemOperations = new ArrayList<>();

    public void queueOperation(ItemOperation itemOperation) {
        itemOperations.add(itemOperation);
    }

    public void checkout() {
        itemOperations.forEach(ItemOperation::execute);
        itemOperations.clear();
    }
}
