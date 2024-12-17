package com.arohau.strategy.ex3_1;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Discounter christmasDiscounter = Discounter.christmas(); // 0.9
        BigDecimal discountedValue1 = christmasDiscounter.apply(BigDecimal.valueOf(100));
        System.out.println(discountedValue1.equals(BigDecimal.valueOf(90.0)));

        Discounter newYearDiscounter = Discounter.newYear(); // 0.8
        BigDecimal discountedValue2 = newYearDiscounter.apply(BigDecimal.valueOf(100));
        System.out.println(discountedValue2.equals(BigDecimal.valueOf(80.0)));

        Discounter easterDiscounter = Discounter.easter(); // 0.5
        BigDecimal discountedValue3 = easterDiscounter.apply(BigDecimal.valueOf(100));
        System.out.println(discountedValue3.equals(BigDecimal.valueOf(50.0)));
    }
}
