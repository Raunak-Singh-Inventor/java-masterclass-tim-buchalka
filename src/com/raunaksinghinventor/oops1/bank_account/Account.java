package com.raunaksinghinventor.oops1.bank_account;

public class Account {
	private String accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;

	public Account() {
		this("56789", 2.50, "Default name", "Default adress", "Default phone");
		System.out.println("Empty constructor called");
	}

	public Account(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
		System.out.println("Account constructor with parameters called");
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public Account(String customerName, String email, String phoneNumber) {
		this("99999", 100.55, customerName, email, phoneNumber);
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
		System.out.println("balance: " + this.balance);
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void deposit(double amount) {
		this.balance += amount;
		System.out.println("successfully added amount to balance");
		System.out.println("Your updated balance is: " + this.balance);
	}

	public void withdraw(double amount) {
		if (balance - amount >= 0) {
			this.balance -= amount;
			System.out.println("sucessfully withdrawed funds");
			System.out.println("Your updated balance is: " + this.balance);
		} else {
			System.out.println("insufficient funds for withdrawal");
			System.out.println("account balance is: " + this.balance);
		}
	}
}
