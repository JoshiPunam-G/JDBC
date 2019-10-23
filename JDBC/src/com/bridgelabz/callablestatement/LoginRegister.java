package com.bridgelabz.callablestatement;

import java.util.Scanner;

import com.bridgelabz.preparedstatement.DBUtility;

public class LoginRegister {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);

			
			System.out.println("***Login & Registration***");
			
			int count=0;
		    while(count>=0)
		    {
		    	System.out.println("1. LOGIN");
		    	System.out.println("2. REGISTER");
		    	System.out.println("3. EXIT");
		    	System.out.println("Enter Your Choice");
		    	int choice=sc.nextInt();
		    	switch(choice)
		    	{
		    	case 1:
		    		System.out.println("Enter Username");
		    		String user=sc.next();
		    		sc.nextLine();
		    		System.out.println("Enter Password");
		    		String pwd=sc.next();
		    	
		    		UtilityCollable.loginUser(user,pwd);
		    		break;
		    	case 2:
		    		UtilityCollable.register();
		    		break;
		    	case 3:
		    		System.out.println("EXIT");
		    		
		    		count=1;
		    		return;
		    	default:
		    		System.out.println("You Entered Wrong Choice  ");
		    		count=1;
		    		return;
		    		
		    	}
		    	
		    }

	}

}