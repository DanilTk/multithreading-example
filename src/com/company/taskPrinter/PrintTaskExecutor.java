package com.company.taskPrinter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintTaskExecutor {
    public static void main(String[] args) {

        PrintTask printTask01 = new PrintTask("task1", 10000);
        PrintTask printTask02 = new PrintTask("task2", 10000);
        PrintTask printTask03 = new PrintTask("task3", 10000);
        PrintTask printTask04 = new PrintTask("task4", 10000);
        PrintTask printTask05 = new PrintTask("task5", 10000);

        ExecutorService executor = Executors.newCachedThreadPool();

        executor.execute(printTask01);
        executor.execute(printTask02);
        executor.execute(printTask03);
        executor.execute(printTask04);
        executor.execute(printTask05);

        executor.shutdown();
    }
}