package com.bridgelaz.aop.before;
public class AccountServiceImpl {

	public void updateAccountBalance(Account account,Long amount){
		System.out.println("Account No:"+account.getAccountNumber()+", Amount:"+amount);
	}
}
