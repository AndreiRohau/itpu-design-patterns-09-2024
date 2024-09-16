package lsp.bank.solution;

import java.math.BigDecimal;

public abstract class AbstractAccount {
    protected abstract Number deposit(BigDecimal amount);
}

