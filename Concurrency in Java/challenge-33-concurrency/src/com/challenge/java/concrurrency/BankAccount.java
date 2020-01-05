package com.challenge.java.concrurrency;

class BankAccount {

    private double balance;
    private String accountNumber;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        showBalance();
    }

    public void withdraw(double amount) {
        balance -= amount;
        showBalance();
    }

    public void showBalance() {
        System.out.println(Thread.currentThread().getName() + ':' + this);
    }

    @Override
    public String toString() {
        return "BankAccount:" +
                "accountNumber='" + accountNumber +
                "', balance=" + balance + '}';
    }
}
