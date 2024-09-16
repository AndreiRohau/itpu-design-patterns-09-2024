package lsp.bank.solution;

import lsp.bank.problem.AbstractAccount;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        FixedTermDepositAccount fixedTermDepositAccount = new FixedTermDepositAccount();
        CustomAccount customAccount = new CustomAccount();

//         now BankingAppWithdrawalService can trust the right type of account to provide the withdraw function.

        BankingAppWithdrawalService bankingAppWithdrawalService = new BankingAppWithdrawalService(customAccount);
        bankingAppWithdrawalService.withdraw(BigDecimal.valueOf(999.99));
    }
}
