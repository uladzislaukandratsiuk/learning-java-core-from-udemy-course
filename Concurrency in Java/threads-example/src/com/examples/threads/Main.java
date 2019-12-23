package com.examples.threads;

import static com.examples.threads.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_GREEN + "Hello from the main thread!");

        Thread myThread = new MyThread();
        myThread.setName(ANSI_RED + "===Another===");
        myThread.start();

        new Thread(() -> System.out.println(ANSI_PURPLE + "Hello from the anonymous class thread!")).start();

        Thread myRunnable = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from the anonymous class's implementation of run()!");
            }
        });

        myRunnable.start();

        System.out.println(ANSI_GREEN + "Hello again from the main thread!");
    }
}
