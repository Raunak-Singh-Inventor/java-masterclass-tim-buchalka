package com.raunaksinghinventor.oops1.vip_customer;

public class Main {

    public static void main(String[] args) {
        VipCustomer customer1 = new VipCustomer();
        System.out.println("name: " + customer1.getName() + "\ncredit limit: " + customer1.getCreditLimit()
        + "\nemail: " + customer1.getEmailAddress());

        VipCustomer customer2 = new VipCustomer("bob",880);
        System.out.println("name: " + customer2.getName() + "\ncredit limit: " + customer2.getCreditLimit()
                + "\nemail: " + customer2.getEmailAddress());

        VipCustomer customer3 = new VipCustomer("pat",600,"pat@gmail.com");
        System.out.println("name: " + customer3.getName() + "\ncredit limit: " + customer3.getCreditLimit()
                + "\nemail: " + customer3.getEmailAddress());
    }
}
