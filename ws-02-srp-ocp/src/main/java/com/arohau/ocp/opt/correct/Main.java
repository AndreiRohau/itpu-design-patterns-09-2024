package com.arohau.ocp.opt.correct;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // input
        List<Type> list = List.of(
                new TypeA(),
                new TypeB(),
                new TypeC());

        // processing
        handleTypes(list);
    }

    // now processing does not care about whether we have new types functionality
    public static void handleTypes(List<Type> list) {
        list.forEach(Type::handle);
    }
}
