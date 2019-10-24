package com.bridgelabz.spring.model;

public class Account {
	
	private String AccountNumber;
	private String AccountDescription;
	
	public Account(String accountNumber, String accountDescription) {
	
		AccountNumber = accountNumber;
		AccountDescription = accountDescription;
	}
	public String getAccountNumber() {
		return AccountNumber;
	}

	public String getAccountDescription() {
		return AccountDescription;
	}

}
