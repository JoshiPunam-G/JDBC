package com.bridgelabz.batchprocessing;

import java.sql.SQLException;
import java.util.Scanner;

import com.bridgelabz.callablestatement.UtilityCollable;
import com.bridgelabz.statement.StatementUtility;

import Utility.Utility;

public class StatementBatch {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		System.out.println("--Welcome To JDBC--");
		System.out.println("Operation On table using Batch PRocessing Statemnt Interface");
		
		int count=0;
		
		while(count>=0)
		{
			
			System.out.println("1. INSERT DATA INTO TABLE");
			System.out.println("2. UPDATE TABLE");
			System.out.println("3. DELETE DATA");
			System.out.println("4. EXIT");
			System.out.println("Enter Your Choice");
			int choice=Utility.isInteger();
			
			switch(choice)
			{
			case 1:
				BatchUtility.insertData();
				break;
			
			case 2:
				BatchUtility.Updatetable();
	            break;
	            
			case 3:
				BatchUtility.Delete();
				break;

			case 4:
				System.out.println("EXIT");
				count=1;
				return;
	            
			 default:
				 System.out.println("You Entered Wrong Choice ");
			     count=1;
			     return;
				
			}
		}	
	}

}