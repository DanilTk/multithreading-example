package com.company.taskPrinter;

import java.security.SecureRandom;

public class PrintTask implements Runnable {

    private static final SecureRandom generator = new SecureRandom();
    private final int sleepTime;
    private final String taskName;

    public PrintTask(String taskName, Integer seconds) {
        this.taskName = taskName;
        this.sleepTime = seconds; // milliseconds
    }

    @Override
    public void run() {
        try {
            System.out.printf("%s going to sleep for %d milliseconds.%n", taskName, sleepTime);
            Thread.sleep(sleepTime); // put thread to sleep
        } catch (InterruptedException exception) {
            exception.printStackTrace();
            Thread.currentThread().interrupt(); // re-interrupt the thread
        }
        System.out.printf("%s done sleeping%n", taskName);
    }
}