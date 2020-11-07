package com.company;

interface MyInterface {

    final int a = 5;

    static void wojtas() {
        System.out.println("Wojtas");
    }

    int hello(int number);

    int ciao();

    default void ello() {
        System.out.println("ello");
    }
}
