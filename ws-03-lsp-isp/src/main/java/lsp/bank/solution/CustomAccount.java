package lsp.bank.solution;

import java.math.BigDecimal;

public class CustomAccount extends AbstractWithdrawableAccount {
    @Override
    protected void deposit(BigDecimal amount) {
        System.out.println("Put " + amount + " to custom account");
    }

    @Override
    protected void withdraw(BigDecimal amount) {
        System.out.println("Get " + amount + " from custom account");
    }
}
