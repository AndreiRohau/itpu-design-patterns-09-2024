package lsp.bank.solution;

import java.math.BigDecimal;

public abstract class AbstractWithdrawableAccount extends AbstractAccount {
    protected abstract Number withdraw(BigDecimal amount) throws Exception;
}
