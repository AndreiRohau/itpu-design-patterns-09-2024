package lsp.bank.problem;

import java.math.BigDecimal;

public abstract class AbstractAccount {
    protected abstract void deposit(BigDecimal amount);
    protected abstract void withdraw(BigDecimal amount);
}

