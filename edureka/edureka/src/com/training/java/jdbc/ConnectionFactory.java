package com.training.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

/**
 * Factory Design pattern is being used to create Objects Connection Factory
 * class has a static method that returns Connection Object by reading
 * dbconfig.properties file dbconfig.properties file is being read using
 * java.util.ResourceBundle.class The ResourceBundle.getBundle() method looks
 * for a properties file without the .properties extension and it expects the
 * properties file to be in the classpath. If dbconfig.properties is not in the
 * classpath, it won't be found, resulting in a MissingResourceException
 */
public class ConnectionFactory {
	private static Connection con = null;

	public static Connection getDBConnection() throws Exception {
		if (con == null) {

			/**
			 * -- Load properties file from classpath -- .properties is optional since we
			 * use ResourceBundle Object -- Ensure dbconfig.properties is in the Classpath:
			 * -- Place dbconfig.properties in the src/main/resources directory (if using
			 * Maven) or the src directory (if using a standard Java project). -- Ensure the
			 * bundle name in ResourceBundle.getBundle("dbconfig") matches the name of the
			 * properties file without the .properties extension. -- Properties file placed
			 * inside com.training.java.jdbc is not used in below case because classpath is
			 * src
			 **/

			ResourceBundle bundle = ResourceBundle.getBundle("dbconfig");

//			String driverClass = bundle.getString("jdbc.driverclass");
			String url = bundle.getString("jdbc.url");
			String username = bundle.getString("jdbc.username");
			String password = bundle.getString("jdbc.password");

			// -- Class.forName() is optional from Java1.8 onwards
			// -- Class.forName(driverClass);
			con = DriverManager.getConnection(url, username, password);
		}

		return con;
	}
}
