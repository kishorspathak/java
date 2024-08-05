package com.training.java.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class SaveEmployee {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getDBConnection();
		
		Statement st = con.createStatement();
		
		// -- Create DML SQL query
		String sql = "insert into emp values (101, 'Sanjay', 2500)";
		
		// -- Execute DML query 
		int employeeSaved = st.executeUpdate(sql);
		
		System.out.println("employees saved = " + employeeSaved);
		
		// -- Close DB connections
		st.close();
		con.close();

	}

}
