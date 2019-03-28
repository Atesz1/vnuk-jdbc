package vn.edu.vnuk.jdbc.sql;

import java.sql.Connection;
import java.sql.SQLException;

public class Sql1000DropDatabase {
	private final Connection connection;
	private final String sqlQuery;
	
	public Sql1000DropDatabase(Connection connection) {
		this.connection = connection;
		this.sqlQuery = "DROP DATABASE IF EXISTS vnuk;";
	}
	
	public void run() throws SQLException {

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(">  Sql1000DropDatabase started");
		
		try {
	        connection.prepareStatement(sqlQuery).execute();
	        System.out.println("   DB \'vnuk\' successfully dropped");
		
		}
		
		catch (Exception e) {
	        e.printStackTrace();
	        connection.close();
		}
		
		finally {
			System.out.println("<  Sql1000DropDatabase ended");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("");
		}
			
	}

}
