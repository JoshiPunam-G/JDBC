package com.bridgelabz.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementUtility {
	
	/**
	 * creating connection 
	 * @return
	 * @throws ClassNotFoundException
	 */

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
	
	     /**
	      * create table using statement interface
	      * @throws ClassNotFoundException
	      */
		public static void createNewTable() throws ClassNotFoundException
		{
			
			 String sql = "CREATE TABLE IF NOT EXISTS studentinfo (\n"
		                + "    id integer NOT NULL AUTO_INCREMENT,\n"
		                + "    firstname varchar(20) ,\n"
		                + "    lastname varchar(20) \n"
		                + ");";
			 try {
				 Connection con=getConnection();
				 Statement st=con.createStatement();
				 st.execute(sql);
				 System.out.println("Table Created Successfully ");
				 System.out.println();
				 con.close();
			 }catch(Exception e)
			 {
				 System.out.println(e.getMessage());
			 }
			
		}
		
		/**
		 * inserting records using statement interface .
		 * @throws ClassNotFoundException
		 * @throws SQLException
		 */
		public static void  insertData() throws ClassNotFoundException, SQLException
		{
			String sql ="INSERT INTO studentinfo (id,firstname ,lastname) "
					+"VALUES ( 4, 'vrushali','joshi')";
			
			try
			{
				Connection con=getConnection();
				Statement st=con.createStatement();
				int i=st.executeUpdate(sql);
				
				System.out.println( i +"Record Inserted Successfully..");
				System.out.println();
				con.close();
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		
		/**
		 * update records using statement interface .
		 */
		public  static void Updatetable()
		{
			String sql="UPDATE  studentinfo SET firstname='sarthak' where id=2 ";

			try
			{
				Connection con=getConnection();
				Statement st=con.createStatement();
				int i=st.executeUpdate(sql);
				System.out.println(i  +"Record Updated Successfully..");
				System.out.println();
				con.close();
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
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
				Connection con=getConnection();
				Statement st=con.createStatement();
				int i=st.executeUpdate(sql);
				System.out.println(i  +"Record Deleted Successfully..");
				System.out.println();
				con.close();
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		
		/**
		 *  retrieve record 
		 * of table using statement interface .
		 */
		public static void show()
		{
			String sql="select * from studentinfo";
			try
			{
				Connection con=getConnection();
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery(sql);  
				while(rs.next())
				{  
					System.out.println(rs.getInt(1)+" "+rs.getString(2));  
				}  
				   
					System.out.println("Record Retrieved Successfully");
				System.out.println("Record Retrieved Successfully ");
				con.close();
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		

}
