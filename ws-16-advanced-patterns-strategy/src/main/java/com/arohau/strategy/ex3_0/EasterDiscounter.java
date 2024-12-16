package com.arohau.strategy.ex3_0;

import java.math.BigDecimal;

public class EasterDiscounter implements Discounter {
    @Override
    public BigDecimal apply(final BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.5));
    }
}
