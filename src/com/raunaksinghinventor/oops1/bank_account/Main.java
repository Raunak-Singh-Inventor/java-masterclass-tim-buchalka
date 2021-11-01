package com.raunaksinghinventor.oops1.bank_account;

public class Main {

	public static void main(String[] args) {
		Account bankAccount = new Account();

		System.out.println(bankAccount.getAccountNumber());
		System.out.println("balance: " + bankAccount.getBalance());

		bankAccount.setAccountNumber("123GeeksRock");
		System.out.println("account number: " + bankAccount.getAccountNumber());
		bankAccount.setBalance(100);
		bankAccount.withdraw(50);
		bankAccount.withdraw(350);
		bankAccount.deposit(500);
		bankAccount.withdraw(350.50);
		bankAccount.withdraw(199.50);

		System.out.println("-------------------------------------");

		Account bobsAccount = new Account("12345", 0.00, "Bobs Brown", "myemail@bob.com", "(087) 123-4567");
		System.out.println(bobsAccount.getAccountNumber());
		System.out.println(bobsAccount.getBalance());

		bobsAccount.withdraw(100.0);

		bobsAccount.deposit(50.0);
		bobsAccount.withdraw(100.0);

		bobsAccount.deposit(51.0);
		bobsAccount.withdraw(100.0);
	}
}
