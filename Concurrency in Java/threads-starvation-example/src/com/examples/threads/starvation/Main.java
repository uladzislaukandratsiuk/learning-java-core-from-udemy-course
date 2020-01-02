package com.examples.threads.starvation;

import com.examples.threads.ThreadColor;

import java.util.concurrent.locks.ReentrantLock;

public class Main {

    private static ReentrantLock reentrantLock = new ReentrantLock(true);

    public static void main(String[] args) {
        Thread firstThread = new Thread(new Runner(ThreadColor.ANSI_PURPLE), "Thread priority 10");
        Thread secondThread = new Thread(new Runner(ThreadColor.ANSI_BLUE), "Thread priority 7");
        Thread thirdThread = new Thread(new Runner(ThreadColor.ANSI_RED), "Thread priority 4");
        Thread fourthThread = new Thread(new Runner(ThreadColor.ANSI_GREEN), "Thread priority 1");

        firstThread.setPriority(10);
        secondThread.setPriority(7);
        thirdThread.setPriority(4);
        fourthThread.setPriority(1);

        secondThread.start();
        fourthThread.start();
        firstThread.start();
        thirdThread.start();
    }

    private static class Runner implements Runnable {
        private int runCount = 1;
        private String color;

        public Runner(String color) {
            this.color = color;
        }

        @Override
        public void run() {
            for (int i = 0; i < 50; i++) {
                reentrantLock.lock();
                try {
                    System.out.format(color + "%s: runCount = %d\n", Thread.currentThread().getName(), runCount++);
                } finally {
                    reentrantLock.unlock();
                }
            }
        }
    }
}
