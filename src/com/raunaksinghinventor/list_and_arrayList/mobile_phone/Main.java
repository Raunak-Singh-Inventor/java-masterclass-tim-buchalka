package com.raunaksinghinventor.list_and_arrayList.mobile_phone;

public class Main {

    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("123-456-789");
        System.out.println(mobilePhone.addNewContact(new Contact("raunak","123-456-789")));
        mobilePhone.printContacts();
        System.out.println(mobilePhone.addNewContact(new Contact("raunak","123-456-789")));
        mobilePhone.printContacts();
    }
}
