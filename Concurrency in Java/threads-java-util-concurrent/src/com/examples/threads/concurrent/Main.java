package com.examples.threads.concurrent;

import com.examples.threads.ThreadColor;

import java.util.Random;
import java.util.concurrent.*;

import static com.examples.threads.concurrent.Main.EOF;

public class Main {

    public static final String EOF = "EOF";

    public static void main(String[] args) {
        ArrayBlockingQueue<String> buffer = new ArrayBlockingQueue<>(5);
        ExecutorService executor = Executors.newFixedThreadPool(3);
        MyProducer producer = new MyProducer(buffer, ThreadColor.ANSI_RED);
        MyConsumer consumer1 = new MyConsumer(buffer, ThreadColor.ANSI_GREEN);
        MyConsumer consumer2 = new MyConsumer(buffer, ThreadColor.ANSI_BLUE);

        executor.execute(producer);
        executor.execute(consumer1);
        executor.execute(consumer2);

        Future<String> future = executor.submit(() -> {
            System.out.println(ThreadColor.ANSI_CYAN + "Callable class output");
            return ThreadColor.ANSI_PURPLE + "This is Callable class, call() method result";
        });

        try {
            System.out.println(future.get());
        } catch (ExecutionException | InterruptedException e) {
            System.out.println("Something went wrong");
        }

        executor.shutdown();
    }
}

class MyProducer implements Runnable {
    private ArrayBlockingQueue<String> buffer;
    private String color;

    public MyProducer(ArrayBlockingQueue<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
    }

    public void run() {
        Random random = new Random();
        String[] nums = {"1", "2", "3", "4", "5"};

        for (String num : nums) {
            try {
                System.out.println(color + "Adding..." + num);
                buffer.put(num);
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                System.out.println("Producer was interrupted");
            }
        }

        System.out.println(color + "Adding EOF and exiting...");
        try {
            buffer.put(EOF);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyConsumer implements Runnable {
    private final ArrayBlockingQueue<String> buffer;
    private String color;

    public MyConsumer(ArrayBlockingQueue<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
    }

    public void run() {
        while (true) {
            synchronized (buffer) {
                try {
                    if (buffer.isEmpty()) {
                        continue;
                    }
                    if (buffer.peek().equals(EOF)) {
                        System.out.println(color + "Exiting");
                        break;
                    } else {
                        System.out.println(color + "Removed..." + buffer.take());
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
