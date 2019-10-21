package com.bridgelabz.statement;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import Utility.Utility;
public class OperationOnTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		System.out.println("--Welcome To JDBC--");
		System.out.println("Operation On table using Statemnt Interface");
		
		int count=0;
		
		while(count>=0)
		{
			System.out.println("1. CREATE TABLE");
			System.out.println("2. INSERT DATA INTO TABLE");
			System.out.println("3. UPDATE TABLE");
			System.out.println("4. DELETE DATA");
			System.out.println("5. VIEW TABLE");
			System.out.println("5. EXIT");
			System.out.println("Enter Your Choice");
			int choice=Utility.isInteger();
			
			switch(choice)
			{
			case 1:
				StatementUtility.createNewTable();
				break;
			
			case 2:
				StatementUtility.insertData();
	            break;
	            
			case 3:
				StatementUtility.Updatetable();
				break;
			case 4:
				StatementUtility.Delete();
				break;
			
			case 5:
				StatementUtility.show();
				break;
				
			case 6:
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
