package lsp.bank.solution;

import java.math.BigDecimal;

public class CustomAccount extends AbstractWithdrawableAccount {
    @Override
    protected BigDecimal deposit(BigDecimal amount) {
        System.out.println("Put " + amount + " to custom account");
        return amount;
    }

    @Override
    protected BigDecimal withdraw(BigDecimal amount) throws IndexOutOfBoundsException {
        System.out.println("Get " + amount + " from custom account");
        return amount;
    }
}
