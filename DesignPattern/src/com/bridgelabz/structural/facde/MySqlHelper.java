package com.bridgelabz.structural.facde;

import java.sql.Connection;

public class MySqlHelper {
	
	public static Connection getMysqlDBConnection()
	{
		return null;
		
	}
	public void generateMySqlPDFReport(String tableName, Connection con)
	{
		System.out.println("MySQL PDF Report");
	}
	public void generateMySqlHTMLReport(String tableName,Connection con)
	{
		System.out.println("MySQL HTML Report");
	}

}
