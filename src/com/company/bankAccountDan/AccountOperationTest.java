package com.company.bankAccountDan;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AccountOperationTest {
    public static void main(String[] args) {

        Account account = new Account(0L);
        AddMoney addMoney = new AddMoney(account);
        WithdrawMoney withdrawMoney = new WithdrawMoney(account);

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(addMoney);
        executorService.execute(addMoney);
        executorService.shutdown();
    }
}