package com.example.unit.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void deposit() {
        BankAccount bankAccount =
                new BankAccount("Vlad", "Kondratuk", 800.00, BankAccount.CHECKING);
        double balance = bankAccount.deposit(350.00, true);
        assertEquals(1150.00, balance, 0);
    }

    @Test
    void withdraw() {
        BankAccount bankAccount =
                new BankAccount("Vlad", "Kondratuk", 1150.00, BankAccount.CHECKING);
        double balance = bankAccount.withdraw(350.00, true);
        assertEquals(800.00, balance, 0);
    }

    @Test
    void getBalance_deposit() {
        BankAccount bankAccount =
                new BankAccount("Vlad", "Kondratuk", 800.00, BankAccount.CHECKING);
        bankAccount.deposit(350.00, true);
        assertEquals(1150.00, bankAccount.getBalance(), 0);
    }

    @Test
    void getBalance_withdraw() {
        BankAccount bankAccount =
                new BankAccount("Vlad", "Kondratuk", 1150.00, BankAccount.CHECKING);
        bankAccount.withdraw(350.00, true);
        assertEquals(800.00, bankAccount.getBalance(), 0);
    }

    @Test
    void isChecking() {
        BankAccount bankAccount =
                new BankAccount("Vlad", "Kondratuk", 1150.00, BankAccount.CHECKING);
        assertTrue(bankAccount.isChecking());
    }
}