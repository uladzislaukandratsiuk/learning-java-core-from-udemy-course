package com.challenge.bank.account;

public class Main {

    public static void main(String[] args) {

        BankAccount bobAccount = new BankAccount();

        bobAccount.setAccountNumber(124);
        bobAccount.setBalance(500);
        bobAccount.setCustomerName("Bob Gilbert");
        bobAccount.setEmail("bobgilbert@gmail.com");
        bobAccount.setPhoneNumber(375297651232L);

        BankAccount gregAccount = new BankAccount(152, 650,
                "Greg Proper", "gregproper@gmail.com",
                375295321322L);

        System.out.println(bobAccount.getClientInfo());
        System.out.println(gregAccount.getClientInfo());

        bobAccount.makeDeposit(52);
        gregAccount.makeDeposit(152);

        bobAccount.makeDeposit(-52);

        bobAccount.makeWithdraw(96);
        gregAccount.makeWithdraw(196);

        gregAccount.makeWithdraw(696);

        System.out.println(bobAccount.getClientInfo());
        System.out.println(gregAccount.getClientInfo());
    }
}
