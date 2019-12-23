package com.examples.threads;

import static com.examples.threads.ThreadColor.ANSI_CYAN;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(ANSI_CYAN + "Hello from the MyRunnable class thread!");
    }
}
