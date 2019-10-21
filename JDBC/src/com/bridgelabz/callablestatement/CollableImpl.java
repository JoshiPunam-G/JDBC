package com.bridgelabz.callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;

import java.sql.SQLException;

import Utility.ConnectionUtility;

public class CollableImpl {
	
	 static	Connection  connection=ConnectionUtility.getConnection();
	
	public static void main(String[] args) throws ClassNotFoundException {
	
		try {
		
			CallableStatement st=connection.prepareCall("{call insertStud(?,?,?)}");
			st.setInt(1, 101);
			st.setString(2, "jyoti");
			st.setString(3,"pawar");
			st.execute();
			System.out.println("record inserted..");

			System.out.println();
		
		
			} catch (SQLException e) {
			
				e.printStackTrace();
			}

	}

}
