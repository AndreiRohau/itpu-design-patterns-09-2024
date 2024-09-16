package lsp.bank.solution;

import java.math.BigDecimal;

public class BankingAppWithdrawalService {
    private AbstractWithdrawableAccount account;

    public BankingAppWithdrawalService(AbstractWithdrawableAccount account) {
        this.account = account;
    }

    public void withdraw(BigDecimal amount) {
        account.withdraw(amount);
    }
}
