/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.vnuk.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author michel
 */
public class TestConnection {
    public static void main(String args[]) throws SQLException{
        try {
        	Connection connection = new ConnectionFactory().getConnection();
            
        	System.out.println("Connection is open!");
            connection.close();
        }
        
        catch (Exception e) {
            e.printStackTrace();
        }
        
        finally {
            System.out.println("Done");
        }
    }
}
