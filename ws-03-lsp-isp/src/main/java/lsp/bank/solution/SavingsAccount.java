package lsp.bank.solution;

import java.io.IOException;
import java.math.BigDecimal;

public class SavingsAccount extends AbstractWithdrawableAccount {
    @Override
    protected BigDecimal deposit(BigDecimal amount) {
        System.out.println("Put " + amount + " to savings account");
        return amount;
    }

    @Override
    protected Number withdraw(BigDecimal amount) throws IOException {
        System.out.println("Get " + amount + " to savings account");
        return amount;
    }
}
