package com.challenge.array.list;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contacts> mobileContacts;

    public MobilePhone() {
        this.mobileContacts = new ArrayList<>();
    }

    public void printListOfContacts() {
        System.out.println("You have " + this.mobileContacts.size() + " contacts");
        for (int i = 0; i < this.mobileContacts.size(); i++) {
            System.out.println((i + 1) + ". " + this.mobileContacts.get(i));
        }
    }

    public boolean addNewContact(Contacts contact) {
        int index = findContact(contact.getName());
        if (index >= 0) {
            return false;
        }
        this.mobileContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contacts oldContact, Contacts updatedContact) {
        int index = findContact(oldContact);
        if (index < 0) {
            return false;
        } else if (findContact(oldContact.getName()) != -1) {
            return false;
        }
        updateContact(index, updatedContact);
        return false;
    }

    private void updateContact(int index, Contacts contact) {
        this.mobileContacts.set(index, contact);
    }

    public boolean removeContact(Contacts contact) {
        int index = findContact(contact.getName());
        if (index < 0) {
            return false;
        }
        this.mobileContacts.remove(contact);
        return true;
    }

    public Contacts queryContact(String contactName) {
        int index = findContact(contactName);
        if (index >= 0) {
            return this.mobileContacts.get(index);
        }
        return null;
    }

    private int findContact(String contactName) {
        for (int i = 0; i < this.mobileContacts.size(); i++) {
            Contacts contacts = this.mobileContacts.get(i);
            if (contacts.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    private int findContact(Contacts contact) {
        return this.mobileContacts.indexOf(contact);
    }
}
