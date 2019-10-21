package com.bridgelabz.structural.facde;

import java.sql.Connection;

public class TestFacade {

	public static void main(String[] args) {
		
	String tableName="Employee";
	
	Connection con=MySqlHelper.getMysqlDBConnection();
	MySqlHelper myhelper=new MySqlHelper();
	myhelper.generateMySqlHTMLReport(tableName, con);
	
	Connection con1=MyOracleHelper.getOrcleDBConnection();
	MyOracleHelper myhelper1=new MyOracleHelper();
	myhelper1.generateMyOraclePDFReport(tableName, con1);
	
	HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
	HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);
	
	}
}
