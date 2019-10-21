package com.bridgelabz.jdbc;
import java.sql.*;
import java.util.Properties;
public class Demo {

	public static void main(String[] args) throws Exception ,SQLException{
		
	/*	Properties properties=new Properties();
		properties.setProperty("username", "root");
		properties.setProperty("password", "admin@123");
		properties.setProperty("useSSL", "false");
		properties.setProperty("autoReconnect", "true");*/
		
		
		String url="jdbc:mysql://localhost:3306/testdb";
		String username="root";
		String password="admin@123";
		
		String query="select * from student ";
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(url,username,password);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);

		while(rs.next())
		{
			String Stud_data=rs.getInt(1)+ " : " +rs.getString(2);
			System.out.println(Stud_data);
		}
		
		st.close();
		con.close();
	}

}
