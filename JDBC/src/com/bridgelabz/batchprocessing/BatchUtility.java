package com.bridgelabz.batchprocessing;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.Scanner;

import Utility.ConnectionUtility;

public class BatchUtility {
	static Scanner sc=new Scanner(System.in);
	 static	Connection  connection=ConnectionUtility.getConnection();
	 //****** BatchProcessing Statement  ************************
		public static void  insertData() throws ClassNotFoundException, SQLException
		{
			Savepoint savepoint1 = connection.setSavepoint("Savepoint1");
			String sql ="INSERT INTO studentinfo (id,firstname ,lastname) "
					+"VALUES ( 4, 'vrushali','joshi')";
			
			try
			{
				connection.setAutoCommit(false);
				Statement st=connection.createStatement();
				
				st.addBatch(sql);
				int[] count = st.executeBatch();
	     		System.out.println( count +"Record Inserted Successfully..");
				System.out.println();
				connection.close();
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
				connection.rollback(savepoint1);
			}
		}
		
		/**
		 * update records using statement interface .
		 * @throws SQLException 
		 */
		public  static void Updatetable() throws SQLException
		{
			Savepoint savepoint1 = connection.setSavepoint("Savepoint1");
			String sql="UPDATE  studentinfo SET firstname='sarthak' where id=2 ";

			try
			{
				Statement st=connection.createStatement();
				
				st.addBatch(sql);
				int[] count = st.executeBatch();
				System.out.println(count  +"Record Updated Successfully..");
				System.out.println();
				connection.close();
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
				connection.rollback(savepoint1);		
			}
		}
		
		/**
		 * delete record from table using statement interface .
		 */
		public static void Delete()
		{
			String sql="DELETE FROM studentinfo where firstname='punam' ";
			try
			{
				
				Statement st=connection.createStatement();
				st.addBatch(sql);
				int[] count = st.executeBatch();
				System.out.println(count +"Record Deleted Successfully..");
				System.out.println();
				connection.close();
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		
		
		//*****************************PreparedStatement********************

		public static void  insertData1() throws ClassNotFoundException, SQLException
		{
			String sql ="INSERT INTO studentinfo (id,firstname ,lastname) "
					+"VALUES ( 4, 'vrushali','joshi')";
			
			try
			{
				PreparedStatement st=connection.prepareStatement(sql);
				st.addBatch(sql);
				int[] count = st.executeBatch();
	     		System.out.println( count +"Record Inserted Successfully..");
				System.out.println();
				connection.close();
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		
		/**
		 * update records using statement interface .
		 */
		public  static void Updatetable1()
		{
			String sql="UPDATE  studentinfo SET firstname='sarthak' where id=2 ";

			try
			{
				
				PreparedStatement st=connection.prepareStatement(sql);
				st.addBatch(sql);
				int[] count = st.executeBatch();
				System.out.println(count  +"Record Updated Successfully..");
				System.out.println();
				connection.close();
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		
		/**
		 * delete record from table using statement interface .
		 */
		public static void Delete1()
		{
			String sql="DELETE FROM studentinfo where firstname='punam' ";
			try
			{
				
				PreparedStatement st=connection.prepareStatement(sql);
				st.addBatch(sql);
				int[] count = st.executeBatch();
				System.out.println(count +"Record Deleted Successfully..");
				System.out.println();
				connection.close();
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		

}
