package com.training.java.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class SaveEmployees {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getDBConnection();
		
		Statement st = con.createStatement();
		
		// -- Create DML SQL query
		String sql = "insert into emp (empno , ename , sal) values(102, 'Praveen', 2750.5), (103, 'Shankar', 3000), "
				+ " (104, 'Bharath', 3250.75), (105, 'Charles', 3500)";
		
		// -- Execute DML query 
		int employeeSaved = st.executeUpdate(sql);
		
		System.out.println("employees saved = " + employeeSaved);
		
		// -- Close DB connections
		st.close();
		con.close();

	}

}
