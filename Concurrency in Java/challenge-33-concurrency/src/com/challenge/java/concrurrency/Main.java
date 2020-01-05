package com.challenge.java.concrurrency;

public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount("12415312", 1000.00);

        new Thread(() -> {
            account.deposit(300.00);
            account.withdraw(50.00);
        }, "Thread 1").start();

        new Thread(() -> {
            account.deposit(203.75);
            account.withdraw(100.00);
        }, "Thread 2").start();
    }
}
