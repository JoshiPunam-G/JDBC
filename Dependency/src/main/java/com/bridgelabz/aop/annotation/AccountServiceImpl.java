package com.bridgelabz.aop.annotation;

import org.springframework.stereotype.Service;

//@Service("accountService ")
public class AccountServiceImpl implements AccountService {
	
	public void updateAccountBalance(Account account,Long amount){
		System.out.println("Account No:"+account.getAccountNumber()+", Amount:"+amount);
	}
}
