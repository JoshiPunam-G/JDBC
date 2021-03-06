package com.bridgelabz.structural.facde;

import java.sql.Connection;

public class HelperFacade {
	
	public static void generateReport(DBTypes dbType, ReportTypes reportType, String tableName)
	{
		Connection con=null;
		switch(dbType)
		{
		case MYSQL:
			con=MySqlHelper.getMysqlDBConnection();
			MySqlHelper helper=new MySqlHelper ();
			switch(reportType)
			{
			case HTML:
				helper.generateMySqlPDFReport(tableName, con);
				break;
			case PDF:
				helper.generateMySqlPDFReport(tableName, con);
				break;
			}
		case ORACLE:
			con=MyOracleHelper.getOrcleDBConnection();
			MyOracleHelper helper1=new 	MyOracleHelper();
			switch(reportType)
			{
			case HTML:
				helper1.generateMyOracleHTMLReport(tableName, con);
				break;
			case PDF:
				helper1.generateMyOraclePDFReport(tableName, con);
				break;
			}
		
		}
		
	}
	
	
	public enum DBTypes {
		MYSQL, ORACLE

	}

    public enum ReportTypes
    {
		HTML, PDF
    	
    }
}
