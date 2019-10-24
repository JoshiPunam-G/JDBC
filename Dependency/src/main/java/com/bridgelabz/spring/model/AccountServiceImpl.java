package com.bridgelabz.spring.model;

public class AccountServiceImpl {
	public void updateAccountBalance(Account account,int amount )
	{
		//Business logic
		System.out.println("Account Number:"+account.getAccountNumber() + "Amount :"+amount);
	}

}
