package com.training.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


/**
 * Hard coded values inside java program is not a good practice. Hence use external dbconfig.properties file
 * For Connection creation using externla config file use Factory Design Pattern to return connection object
 */
public class CreateTable {

	public static void main(String[] args) throws Exception {

		// -- initialize JDBC driver class of MySQL
		// There is pre-defined class in java called "Class.class"
		// Class.class is used for loading class using .forName(<className>) method
		Class.forName("com.mysql.cj.jdbc.Driver");

		// -- Connect to db_edureka MySQL database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_edureka", "root", "password");

		// -- Create an object for passing SQL query
		Statement st = con.createStatement();

		// DDL Query uses execute(<sqlString>) method
		String sql = "create table emp (empno int, ename varchar(30), sal float(10,2), primary key (empno))";

		// -- Pass the SQL query to execute
		try {
			st.execute(sql); // for DDL use execute() method of java.sal.Statement class
			System.out.println("Database Table Created!!");
		} catch (Exception ex) {
			System.err.println("ERROR : " + ex.toString());
		}

		// -- Close the connection with database
		st.close();
		con.close();
	}

}
