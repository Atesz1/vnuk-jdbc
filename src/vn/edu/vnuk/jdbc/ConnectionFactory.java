package vn.edu.vnuk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection() {
		return returnConnection("jdbc:mysql://localhost/vnuk");
	}
	
	
	public Connection getConnection(String url) {
		return returnConnection(url);
	}
	
	
	private Connection returnConnection(String url) {
		try {
			return DriverManager.getConnection(
					url, 
					System.getenv("DB_USR"), 
					System.getenv("DB_PWD")
				);
		}
		
		catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
