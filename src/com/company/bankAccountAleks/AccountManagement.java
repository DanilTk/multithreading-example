package com.company.bankAccountAleks;

public class AccountManagement {

    private long accountBalance;

    public AccountManagement(long accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void debitToAccount(long value) {
        accountBalance += value;
    }

    public void creditToAccount(long value) {
        accountBalance -= value;
    }

    public synchronized long getAccountBalance() {
        return accountBalance;
    }
}