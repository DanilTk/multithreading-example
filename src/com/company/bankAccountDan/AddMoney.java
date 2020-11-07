package com.company.bankAccountDan;

public class AddMoney implements Runnable {

    private Account account;

    public AddMoney(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            Long balance = account.getBalance();

            System.out.printf(Thread.currentThread().getName() + ". Balance before topup: %d \n", balance);

            Long amount = 10l;
            account.topup(amount);
            balance = account.getBalance();

            System.out.printf(Thread.currentThread().getName() + ". Added %d to account. Current balance: %d \n", amount, balance);
        }
    }
}