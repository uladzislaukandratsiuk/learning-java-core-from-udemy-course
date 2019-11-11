package com.challenge.vip.client;

public class VipClient {

    private String name;
    private int creditLimit;
    private String emailAddress;

    public VipClient() {
        this("Default name", 9999, "default@email.com");
    }

    public VipClient(String name, int creditLimit) {
        this (name, creditLimit, "default@email.com");
    }

    public VipClient(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
    
    public String getClientInfo() {
        return "Name: " + getName() + ", Credit Limit: " + getCreditLimit()
                + ", Email Address: " + getEmailAddress();
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
