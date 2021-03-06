package com.bridgelabz.callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Scanner;

import Utility.ConnectionUtility;

public class UtilityCollable {
	static Scanner sc=new Scanner(System.in);
	 static	Connection  connection=ConnectionUtility.getConnection();
	 
	 
	public static void loginUser(String user,String pwd)
	{
		try
		{ 
			    connection=ConnectionUtility.getConnection();  
				CallableStatement cs=connection.prepareCall("{call selectUser(?,?)}");
				cs.setString(1, user);
				cs.setString(2, pwd);
				
				ResultSet rs=cs.executeQuery();
				int count=0;
				while(rs.next()){  
				//rs.getString(1)+" "+rs.getString(2); 
				count++;
				} 
				if(count>0)
				{			
				  System.out.println("Login Successfully");
				}
				else 
				{
					System.out.println("Username & Password Not Found ");
					int count1=0;
					while(count1>=0)
					{
					System.out.println("Do You Want To Register ");
					System.out.println("1. Yes  \n 2. No  \n 3.EXIT");
					int choice=sc.nextInt();
					switch(choice)
					{
					case 1: register(); break;
					case 2: System.out.println("Thank You "); count1=1; return;
					case 3: System.out.println("EXIT");  count1=1; return;
					default: System.out.println("wrong choice"); count1=1;return;
					}
					}
				}
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	/**
	 * Login implementation
	 */
	public static void register()
	{
		try
		{	
			 connection=ConnectionUtility.getConnection();  
			CallableStatement cs=connection.prepareCall("{call insertUser(?,?,?)}");
			
			System.out.println("**Registration Form**");
		
		    System.out.println("Enter name:");
		    String user=sc.next();
		    sc.next();
		    System.out.println("Enter Email");
		    String email=sc.next();
		    sc.next();
		    System.out.println("Enter Age");
		    int age=sc.nextInt();
		
		    cs.setString(1, user);
			cs.setString(2, email);
			cs.setInt(3,age);
			
	       cs.execute();
			
			insertUSer();
			
//		    
			System.out.println(" Registration Successfully ..!");
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
public static void insertUSer()
{
	try
	{
		 connection=ConnectionUtility.getConnection();  
		 CallableStatement cs=connection.prepareCall("{call login(?,?)}");
		
		System.out.println("Enter New Details");
		System.out.println("****");
		
		System.out.println("Enter Username");
		String user=sc.next();
		String password=validate();
		
		cs.setString(1, user);
		cs.setString(2, password);
		
		int i=cs.executeUpdate();
		System.out.println( i  +  "Record Inserted Successfully");
	
	}catch(Exception e)
	{
		System.out.println(e);
	}
}

public static String validate()
{
	System.out.println("Enter New Password");
	String password=sc.next();	
	System.out.println("Re-Enter passowrd");
	String repassword=sc.next();
	int count=0;
	while(count>=0)
	{
	if(repassword.equals(password))
	{
		return password;
		
	}
	else
	{
		count=1;
		System.out.println("Password Should Be Same");
		validate();
	}
	}

	return repassword;
	
	
}

}
