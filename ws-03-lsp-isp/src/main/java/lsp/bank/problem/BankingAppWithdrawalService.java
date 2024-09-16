package lsp.bank.problem;

import java.math.BigDecimal;

public class BankingAppWithdrawalService {
    private AbstractAccount account;

    public BankingAppWithdrawalService(AbstractAccount account) {
        this.account = account;
    }

    public void withdraw(BigDecimal amount) {
        account.withdraw(amount);
    }
}
