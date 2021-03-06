package com.bridgelabz.preparedstatement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import Utility.Utility;


public class DBUtility {
	
	static Scanner sc=new Scanner(System.in);
		
		//*************************PreparedStatemnet Interface**************************************
		
	public static Connection getConnection() throws ClassNotFoundException
	{
		try {
			
		Class.forName("com.mysql.jdbc.Driver");	
		
		String url="jdbc:mysql://localhost:3306/testdb";
		String username="root";
		String password="admin@123";
		
		Connection conn=DriverManager.getConnection(url,username,password);
		System.out.println("connected...");

		System.out.println();
	//	conn.close();
		return conn;
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		return null;
		
	}
		/***
		 * create table 
		 */
		public static void createTable()
		{
			try
			{
				Connection con=getConnection();
				PreparedStatement create=con.prepareStatement("create table register( \n "
						+ "  email varchar(30) NOT NULL   ,\n"
						+ "  city varchar(20) NOT NULL ,\n"
						+ "  username varchar(20) NOT NULL ,\n"
						+ "  password varchar(20) NOT NULL  ,\n"
						+ "  repassword varchar(20) NOT NULL )");
				create.executeUpdate();
				//con.close();
			}catch(Exception e)
			{
				System.out.println(e);
			}
			
			System.out.println("Table Has been Created Successfully");
		}
		
		/**
		 * insert record
		 */
		public static void isInsert()
		{
			try
			{
				Connection con=getConnection();
				PreparedStatement st=con.prepareStatement("insert into StudentData values (?,?,?)");
				st.setInt(1, 60);
				st.setString(2, "yogita");
				st.setString(3,"joshi");
		
				int i=st.executeUpdate();
				System.out.println( i  +  "Record Inserted Successfully");
			
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
		/**
		 * update table
		 */
		public static void isUpdate()
		{
			try
			{
				Connection con=getConnection();
				PreparedStatement st=con.prepareStatement("update StudentData set firstname=? where lastname=?");
			    st.setString(1, "ashwini");
	            st.setString(2, "kolte");
			    int i=st.executeUpdate();
				System.out.println( i  +  "Record Updated  Successfully");
				//con.close();
				
			}catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
		/**
		 * delete record 
		 */
		public static void isDelete()
		{
			try
			{
				Connection con=getConnection();
				PreparedStatement st=con.prepareStatement("delete from User where username=?");
	           st.setString(1, "root");
			    int i=st.executeUpdate();
				System.out.println( i   + "Record Deleted  Successfully");
				//con.close();
				
			}catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
		/**
		 * retrieve the records of a table
		 */
		public static void retrieve()
		{
			try
			{
				Connection con=getConnection();
				PreparedStatement st=con.prepareStatement("select * from user");
				ResultSet rs=st.executeQuery();  
				
				while(rs.next()){  
				System.out.println(rs.getString(1)+" "+rs.getString(2));  
				}  
			   
				System.out.println("Record Retrieved Successfully");
				//con.close();
				
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
		
		/**
		 * Login Implemntation
		 * @param user
		 * @param pwd
		 */
		
		public static void loginUser(String user,String pwd)
		{
			try
			{
				    Connection con=getConnection();
					PreparedStatement st=con.prepareStatement("select * from login where username=? and password=?" );
					st.setString(1, user);
					st.setString(2,pwd);
					ResultSet rs=st.executeQuery();
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
		
		
		
		public static void register()
		{
			try
			{	
				Connection con=getConnection();

				PreparedStatement st=con.prepareStatement("insert into register values (?,?,?)");
				
				System.out.println("**Registration Form**");
			
			    System.out.println("Enter name:");
			    String user=sc.next();
			    System.out.println("Enter Email");
			    String email=sc.next();
			   // sc.next();
			    System.out.println("Enter Age");
			    int age=sc.nextInt();
			
				st.setString(1, user);
				st.setString(2, email);
				st.setInt(3,age);
				
				st.executeUpdate();
				
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
			Connection con=getConnection();
			PreparedStatement st=con.prepareStatement("insert into login values (?,?)");
			
			System.out.println("Enter New Details");
			
			
			System.out.println("Enter Username");
			String user=sc.next();
			String password=validate();
			
			st.setString(1, user);
			st.setString(2, password);
			
			int i=st.executeUpdate();
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
		
		if(password==repassword)
		{
			System.out.println("Password Match");
		}
		else
		{
			System.out.println("Password Should Be Same");
			validate();
		}
		return password;
		
	}
	

}

