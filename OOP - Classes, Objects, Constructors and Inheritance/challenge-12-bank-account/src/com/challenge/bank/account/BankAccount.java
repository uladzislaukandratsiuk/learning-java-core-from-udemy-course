package com.challenge.bank.account;

public class BankAccount {

    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmailAddress;
    private long customerPhoneNumber;

    public BankAccount() {
        this (123, 50, "Default name",
                "Default email" , 3750000000L);
    }

    public BankAccount(int accountNumber, double accountBalance, String customerName,
                       String customerEmailAddress, long customerPhoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return accountBalance;
    }

    public void setBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return customerEmailAddress;
    }

    public void setEmail(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public long getPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setPhoneNumber(long customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getClientInfo() {
        return "Account number = " + accountNumber + ", Client Name = "
                + customerName + ", Balance = " + accountBalance;
    }

    public void makeDeposit(double depositAmount) {
        if (depositAmount > 0) {
            accountBalance += depositAmount;
            System.out.println("Deposit of " + depositAmount + ". New accountBalance is " + accountBalance);
        } else {
            System.out.println("Deposit not processed. Balance is " + accountBalance);
        }
    }

    public void makeWithdraw(double withdrawAmount) {
        if (accountBalance - withdrawAmount > 0) {
            accountBalance -= withdrawAmount;
            System.out.println("Withdraw of " + withdrawAmount + ". New accountBalance is " + accountBalance);
        } else {
            System.out.println("Withdraw not processed. Balance is " + accountBalance);
        }
    }
}
