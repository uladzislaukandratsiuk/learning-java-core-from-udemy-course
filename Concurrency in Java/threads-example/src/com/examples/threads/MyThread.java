package com.examples.threads;

import static com.examples.threads.ThreadColor.ANSI_BLUE;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from the " + currentThread().getName() + ANSI_BLUE + " thread!");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(ANSI_BLUE +  "Another thread woke me up");
            return;
        }

        System.out.println(ANSI_BLUE + "Three seconds have passed and I'm awake");
    }
}
