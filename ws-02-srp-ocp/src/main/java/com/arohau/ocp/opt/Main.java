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
                    System.out.println("Here is the logic to handle TypeA");
                    break;
                case "TypeB":
                    System.out.println("Here is the different logic to handle TypeB");
                    break;
                default:
                    System.out.println("unknown type" + type);
            }
        });
    }

}