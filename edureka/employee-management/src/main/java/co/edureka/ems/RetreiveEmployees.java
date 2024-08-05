package co.edureka.ems;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import co.edureka.ems.config.ConnectionFactory;

public class RetreiveEmployees {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getDBConnection();
		
		Statement st = con.createStatement();
		
		// -- Create DRL SQL query
		String sql = "select * from emp";
		
		// -- Execute DRL query 
		ResultSet rs = st.executeQuery(sql);
		
		// -- rs.next() points to before first row of table.
		while (rs.next()) { 
			int empno = rs.getInt(1); // -- or rs.get
			String empname = rs.getString(2); // or rs.getString("ename")
			float empsal = rs.getFloat(3); // or rs.getFloat("sal")
			
			String employee = String.format("Employee[%-3d | %-10s | %.2f]", empno, empname, empsal);
			System.out.println(employee);
			Thread.sleep(1000);
		}
		
		// -- Close DB connections
		st.close();
		con.close();

	}

}
