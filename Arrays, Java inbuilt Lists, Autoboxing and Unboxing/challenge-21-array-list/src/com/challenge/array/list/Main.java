package com.challenge.array.list;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {

        boolean quit = false;
        int choice;

        printListOfOptions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                default:
                    System.out.println("Wrong option number.");
                    continue;
                case 1:
                    quit = true;
                    System.out.println("Shutdown phone.");
                    break;
                case 2:
                    mobilePhone.printListOfContacts();
                    break;
                case 3:
                    addContact();
                    break;
                case 4:
                    updateContact();
                    break;
                case 5:
                    removeContact();
                    break;
                case 6:
                    searchContact();
                    break;
                case 7:
                    printListOfOptions();
                    break;
            }
        }

    }

    private static void printListOfOptions() {
        System.out.println(
                "\tOptions:\n" +
                        "\t1.Quit.\n" +
                        "\t2.Print list of contacts.\n" +
                        "\t3.Add new contact.\n" +
                        "\t4.Update existing contact.\n" +
                        "\t5.Remove contact \n" +
                        "\t6.Search/find contact.\n" +
                        "\t7.Print list of options.\n");
    }

    private static void addContact() {
        System.out.println("Please enter the new contact name: ");
        String name = scanner.nextLine();

        System.out.println("Please enter the new contact phone number: ");
        String phoneNumber = scanner.nextLine();

        Contacts newContact = Contacts.createContact(name, phoneNumber);

        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact (name = " + newContact.getName() +
                    ", phone number = " + newContact.getPhoneNumber() + "), has been added");
        } else {
            System.out.println("Contact with name = " + newContact.getName() + ", already exists");
        }
    }

    private static void updateContact() {
        System.out.print("Please enter the existing contact name for update: ");
        String name = scanner.nextLine();

        Contacts existingContact = mobilePhone.queryContact(name);

        if (existingContact == null) {
            System.out.println("Contact was not found.");
            return;
        }

        System.out.println("Please enter the new contact name: ");
        String updatedName = scanner.nextLine();

        System.out.println("Please enter the new contact phone number: ");
        String updatedPhoneNumber = scanner.nextLine();

        Contacts updatedContact = Contacts.createContact(updatedName, updatedPhoneNumber);

        if (mobilePhone.updateContact(existingContact, updatedContact)) {
            System.out.println("Contact has been updated to (name = " + updatedContact.getName()
                    + ", phone number = " + updatedContact.getPhoneNumber() + ").");
        } else {
            System.out.println("Contact with same name already exis");
        }
    }

    private static void removeContact() {
        System.out.print("Please enter the existing contact name for remove: ");
        String name = scanner.nextLine();

        Contacts existingContact = mobilePhone.queryContact(name);

        if (existingContact == null) {
            System.out.println("Contact was not found.");
            return;
        }

        if (mobilePhone.removeContact(existingContact)) {
            System.out.println("Contact has been removed");
        } else {
            System.out.println("Remove failure");
        }
    }

    private static void searchContact() {
        System.out.print("Please enter the existing contact name for search: ");
        String name = scanner.nextLine();

        Contacts existingContact = mobilePhone.queryContact(name);

        if (existingContact == null) {
            System.out.println("Contact was not found.");
            return;
        }

        System.out.println("Contact with (name = " + existingContact.getName() +
                ", phone number = " + existingContact.getPhoneNumber() +
                "), has been founded.");
    }
}
