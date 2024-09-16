package lsp.bank.solution;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        FixedTermDepositAccount fixedTermDepositAccount = new FixedTermDepositAccount();

        // now BankingAppWithdrawalService can trust the right type of account to provide the withdraw function.

//        BankingAppWithdrawalService bankingAppWithdrawalService = new BankingAppWithdrawalService(fixedTermDepositAccount);
//        bankingAppWithdrawalService.withdraw(BigDecimal.valueOf(999.99));
    }
}
