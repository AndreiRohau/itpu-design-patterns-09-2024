package lsp.bank.solution;

import java.math.BigDecimal;

public class FixedTermDepositAccount extends AbstractAccount {
    // Overridden methods...

    @Override
    protected void deposit(BigDecimal amount) {
        System.out.println("Put " + amount + " to FixedTerm account");
    }

    @Override
    protected void withdraw(BigDecimal amount) {
        throw new UnsupportedOperationException("Withdrawals are not supported by FixedTermDepositAccount!!");
    }
}
