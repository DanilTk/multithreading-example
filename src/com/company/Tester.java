package com.company;

public class Tester implements MyInterface {

    public static void main(String[] args) {
        Tester tester = new Tester();
        tester.hello(10);
        System.out.println(a);
        tester.ello();
        MyInterface.wojtas();
    }

    @Override
    public int hello(int number) {
        return number;
    }

    @Override
    public int ciao() {
        return 0;
    }

    public void dan() {

    }

    public int dan(int x) {
        return x;
    }
}