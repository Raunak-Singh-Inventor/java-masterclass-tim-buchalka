package com.raunaksinghinventor.list_and_arrayList.mobile_phone;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> myContacts;
    private String myNumber;

    public MobilePhone(String myNumber) {
        this.myContacts = new ArrayList<>();
        this.myNumber = myNumber;
    }

    public boolean addNewContact(Contact contact) {
        if(findContact(contact)>=0) {
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if(findContact(oldContact)<0) {
            return false;
        }
        myContacts.set(myContacts.indexOf(oldContact),newContact);
        return true;
    }

    public boolean removeContact(Contact contact) {
        if(myContacts.remove(contact)) {
            return true;
        }
        return false;
    }

    private int findContact(Contact contact) {
        return findContact(contact.getName());
    }

    private int findContact(String name) {
        for(int i = 0; i < myContacts.size(); i++) {
            if(myContacts.get(i).getName()==name) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        for(int i = 0; i < myContacts.size(); i++) {
            if(myContacts.get(i).getName()==name) {
                return myContacts.get(i);
            }
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for(int i = 0; i < myContacts.size(); i++) {
            System.out.println((i+1) + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }
}
