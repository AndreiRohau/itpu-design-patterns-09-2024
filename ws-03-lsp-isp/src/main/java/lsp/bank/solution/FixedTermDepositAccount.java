package lsp.bank.solution;

import java.math.BigDecimal;

public class FixedTermDepositAccount extends AbstractAccount {
    // Overridden methods...

    @Override
    protected BigDecimal deposit(BigDecimal amount) {
        System.out.println("Put " + amount + " to FixedTerm account");
        return amount;
    }

}
