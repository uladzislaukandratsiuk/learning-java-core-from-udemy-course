package com.challenge.autoboxing.unboxing;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomerToTheBranch(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            branch.addCustomer(customerName, initialTransaction);
            return true;
        }
        return false;
    }

    public boolean addCustomerAdditionalTransaction(String branchName, String customerName,
                                                    double additionalTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            branch.addAdditionalTransaction(customerName, additionalTransaction);
            return true;
        }
        return false;
    }

    private Branch findBranch(String name) {
        for (Branch branch : this.branches) {
            if (branch.getName().equals(name)) {
                return branch;
            }
        }
        return null;
    }

    public boolean printListCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            System.out.println("Customer details for branch " + branch.getName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for(int i=0; i<branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer[" + (i+1) + "]: " + branchCustomer.getName());
                if(showTransactions) {
                    System.out.println("Transactions:");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for(int j=0; j<transactions.size(); j++) {
                        System.out.println("Amount[" + (j+1) + "]: "  + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", branches=" + branches +
                '}';
    }
}
