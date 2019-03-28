package vn.edu.vnuk.jdbc.sql;

import java.sql.Connection;
import java.sql.SQLException;

public class Sql2010CreateContacts {
	private final Connection connection;
	private final String sqlQuery;
	
	public Sql2010CreateContacts(Connection connection) {
		this.connection = connection;
		
		this.sqlQuery = "CREATE TABLE IF NOT EXISTS contacts ("
				+ 	"id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, "
				+ 	"name VARCHAR(255) NOT NULL, "
				+ 	"email VARCHAR(255) NOT NULL, "
				+ 	"address VARCHAR(255) NOT NULL, "
				+ 	"date_of_register DATE NOT NULL"
				+ ");"
			;
	}
	
	public void run() throws SQLException {

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(">  Sql2010CreateContacts started");
		
		try {
	        connection.prepareStatement(sqlQuery).execute();
	        System.out.println("   TABLE \'contacts\' successfully created");
		
		}
		
		catch (Exception e) {
	        e.printStackTrace();
	        connection.close();
		}
		
		finally {
			System.out.println("<  Sql2010CreateContacts ended");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("");
		}
			
	}
}
