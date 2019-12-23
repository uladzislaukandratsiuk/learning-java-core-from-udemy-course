package com.examples.threads;

import static com.examples.threads.ThreadColor.ANSI_GREEN;
import static com.examples.threads.ThreadColor.ANSI_PURPLE;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_GREEN + "Hello from main thread!");

        Thread myThread = new MyThread();
        myThread.start();

        new Thread(() -> System.out.println(ANSI_PURPLE + "Hello from anonymous thread!")).start();

        System.out.println(ANSI_GREEN + "Hello again from main thread!");
    }
}
