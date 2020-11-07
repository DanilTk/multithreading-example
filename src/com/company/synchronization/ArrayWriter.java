package com.company.synchronization;

public class ArrayWriter implements Runnable {

    private final SimpleArray simpleArray;
    private final int startValue;

    public ArrayWriter(int value, SimpleArray array) {
        startValue = value;
        simpleArray = array;
    }

    public void run() {
        for (int i = startValue; i < startValue + 3; i++) {
            simpleArray.add(i); // add an element to the array
        }
    }
}