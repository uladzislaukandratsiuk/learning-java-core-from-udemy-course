package com.examples.deadlock.wait.notifyAll;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Message message = new Message();
        (new Thread(new MyWriter(message))).start();
        (new Thread(new MyReader(message))).start();
    }
}

class Message {
    private String message;
    private boolean empty = true;

    public synchronized String read() {
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        empty = true;
        notifyAll();
        return message;
    }

    public synchronized void write(String message) {
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        empty = false;
        this.message = message;
        notifyAll();
    }
}

class MyWriter implements Runnable {
    private Message message;

    public MyWriter(Message message) {
        this.message = message;
    }

    public void run() {
        String[] messages = {
                "You will not grasp her with your mind",
                "Or cover with a common label,",
                "For Russia is one of a kind –",
                "Believe in her, if you are able…"
        };

        Random random = new Random();

        for (String s : messages) {
            message.write(s);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        message.write("Finished");
    }
}

class MyReader implements Runnable {
    private Message message;

    public MyReader(Message message) {
        this.message = message;
    }

    public void run() {
        Random random = new Random();
        for (String latestMessage = message.read(); !latestMessage.equals("Finished");
             latestMessage = message.read()) {
            System.out.println(latestMessage);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
