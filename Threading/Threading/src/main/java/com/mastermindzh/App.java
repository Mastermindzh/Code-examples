package com.mastermindzh;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Thread t1 = new Thread(new threadObject("thread 1"));
        Thread t2 = new Thread(new threadObject("thread 2"));

        t1.start();
        t2.start();
    }
}
