package com.arohau.strategy.ex3_0;

import java.math.BigDecimal;

public class ChristmasDiscounter implements Discounter {
    @Override
    public BigDecimal apply(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.9));
    }
}
