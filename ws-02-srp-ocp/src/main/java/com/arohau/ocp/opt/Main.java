package com.arohau.ocp.opt;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // input
        List<Object> list = List.of(new TypeA(), new TypeB());

        // processing
        handleTypes(list);
    }

    // every new type functionality implementation require code changes in place where current functionality is located
    private static void handleTypes(List<Object> list) {
        list.forEach(e -> {
            String type = e.getClass().getSimpleName();
            switch (type) {
                case "TypeA":
                    executeTypeAFunc();
                    break;
                case "TypeB":
                    executeTypeBFunc();
                    break;
                default:
                    executeUnknownFunc(type);
            }
        });
    }

    private static void executeTypeAFunc() {
        System.out.println("Here is the logic to handle TypeA");
    }

    private static void executeTypeBFunc() {
        System.out.println("Here is the different logic to handle TypeB");
    }

    private static void executeUnknownFunc(Object type) {
        System.out.println("unknown type" + type);
    }

}
