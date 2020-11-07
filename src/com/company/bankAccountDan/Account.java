package com.company.bankAccountDan;

public class Account {
    private Long balance;

    public Account(Long balance) {
        this.balance = balance;
    }

    public synchronized void topup(Long amount) {
        balance += amount;
    }

    public void withdraw(Long amount) {
        balance -= amount;
    }

    public synchronized Long getBalance() {
        return balance;
    }
}