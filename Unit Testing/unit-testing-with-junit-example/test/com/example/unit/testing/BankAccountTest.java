package com.example.unit.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private BankAccount bankAccount;

    @BeforeEach
    void setup() {
        bankAccount = new BankAccount("Vlad", "Kondratuk", 900.00, BankAccount.CHECKING);
    }

    @Test
    void deposit() {
        double balance = bankAccount.deposit(350.00, true);
        assertEquals(1250.00, balance, 0);
    }

    @Test
    void withdraw_branch() {
        double balance = bankAccount.withdraw(350.00, true);
        assertEquals(550.00, balance, 0);
    }

    @Test
    void withdraw_notBranch() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            double balance = bankAccount.withdraw(550.00, false);
            assertEquals(350.00, balance, 0);
        });

        String expectedMessage = "You cannot withdraw more than 500.00 at an ATM";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void getBalance_deposit() {
        bankAccount.deposit(350.00, true);
        assertEquals(1250.00, bankAccount.getBalance(), 0);
    }

    @Test
    void getBalance_withdraw() {
        bankAccount.withdraw(350.00, true);
        assertEquals(550.00, bankAccount.getBalance(), 0);
    }

    @Test
    void isChecking() {
        assertTrue(bankAccount.isChecking());
    }
}