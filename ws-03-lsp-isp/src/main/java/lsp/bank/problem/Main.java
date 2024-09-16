package lsp.bank.problem;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        FixedTermDepositAccount fixedTermDepositAccount = new FixedTermDepositAccount();

        BankingAppWithdrawalService bankingAppWithdrawalService = new BankingAppWithdrawalService(fixedTermDepositAccount);

        bankingAppWithdrawalService.withdraw(BigDecimal.valueOf(999.99));
    }
}
