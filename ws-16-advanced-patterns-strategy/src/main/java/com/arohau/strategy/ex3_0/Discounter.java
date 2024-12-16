package com.arohau.strategy.ex3_0;

import java.math.BigDecimal;

public interface Discounter {
    BigDecimal apply(BigDecimal amount);
}
