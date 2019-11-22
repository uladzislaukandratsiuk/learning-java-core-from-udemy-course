package com.challenge.autoboxing.unboxing;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addCustomer(String customerName, double initialTransaction) {
        Customer excitingCustomer = findCustomer(customerName);
        if (excitingCustomer != null) {
            return false;
        }
        this.customers.add(new Customer(customerName, initialTransaction));
        return true;
    }

    public boolean addAdditionalTransaction(String customerName, double additionalTransaction) {
        Customer excitingCustomer = findCustomer(customerName);
        if (excitingCustomer == null) {
            return false;
        }
        excitingCustomer.addTransaction(additionalTransaction);
        return true;
    }

    private Customer findCustomer(String name) {
        for (Customer customer : this.customers) {
            if (customer.getName().equals(name)) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }
}
