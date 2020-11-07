package com.company.bankAccountDan;

public class WithdrawMoney implements Runnable {

    private Account account;

    public WithdrawMoney(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            Long balance = account.getBalance();
            System.out.printf(Thread.currentThread().getName() + " Balance before withdrawal: %d%n", balance);
            Long amount = 10l;
            account.withdraw(amount);
            balance = account.getBalance();
            System.out.printf(Thread.currentThread().getName() + " Took %d from account. Current balance: %d ", amount, balance);
        }
    }
}