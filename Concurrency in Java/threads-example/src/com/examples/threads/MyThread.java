package com.examples.threads;

import static com.examples.threads.ThreadColor.ANSI_BLUE;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from MyThread!");
    }
}
