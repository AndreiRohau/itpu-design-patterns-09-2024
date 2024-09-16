package lsp.bank.solution;

import java.math.BigDecimal;

public class SavingsAccount extends AbstractWithdrawableAccount {
    @Override
    protected void deposit(BigDecimal amount) {
        System.out.println("Put " + amount + " to savings account");
    }

    @Override
    protected void withdraw(BigDecimal amount) {
        System.out.println("Get " + amount + " to savings account");
    }
}
