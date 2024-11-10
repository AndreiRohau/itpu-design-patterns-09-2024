package com.arohau.command.ex1;

import java.util.ArrayList;
import java.util.List;

public class ItemOperationExecutor {

    public void doOperation(ItemOperation itemOperation) {
        itemOperation.execute();
    }

    List<ItemOperation> itemOperations = new ArrayList<>();

    public void queueOperation(ItemOperation itemOperation) {
        itemOperations.add(itemOperation);
    }

    public void checkout() {
        itemOperations.forEach(ItemOperation::execute);
        itemOperations.clear();
    }
}
