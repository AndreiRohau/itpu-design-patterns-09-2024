package lsp.bank.solution;

import java.math.BigDecimal;

public abstract class AbstractWithdrawableAccount extends AbstractAccount {
    protected abstract void deposit(BigDecimal amount);
    protected abstract void withdraw(BigDecimal amount);
}

