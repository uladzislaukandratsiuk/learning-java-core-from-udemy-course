package com.challenge.autoboxing.unboxing;

public class Main {


    public static void main(String[] args) {

        Bank bank = new Bank("Belarus Bank");

        if (bank.addBranch("Brest")){
            System.out.println("Branch Brest created!\n");
        }

        bank.addCustomerToTheBranch("Brest", "Alex", 523.23);
        bank.addCustomerToTheBranch("Brest", "Pavel", 412.05);
        bank.addCustomerToTheBranch("Brest", "Igor", 124.52);

        bank.printListCustomers("Brest", false);

        if (bank.addCustomerToTheBranch("Brest", "Alex", 123.23)) {
            System.out.println("\nCustomer Alex already exists!\n");
        }

        bank.addCustomerAdditionalTransaction("Brest", "Alex", 212.12);

        bank.printListCustomers("Brest", true);


        if (!bank.addBranch("Brest")){
            System.out.println("\nBranch Brest already exists!\n");
        }

        if (bank.addCustomerAdditionalTransaction("Minsk", "Alex", 123.23)) {
            System.out.println("\nBranch Minsk not exists!\n");
        }

        bank.addBranch("Minsk");

        bank.addCustomerToTheBranch("Minsk", "Bogdan", 123.23);
        bank.addCustomerAdditionalTransaction("Minsk", "Bogdan", 723.23);

        bank.printListCustomers("Minsk", true);

        if (!bank.addBranch("Minsk")){
            System.out.println("\nBranch Minsk already exists!\n");
        }

        System.out.println(bank.getBranches());
    }
}
