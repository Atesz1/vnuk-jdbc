package vn.edu.vnuk.jdbc.test;

import java.sql.SQLException;
import java.util.Scanner;

import vn.edu.vnuk.jdbc.dao.ContactDao;
import vn.edu.vnuk.jdbc.model.Contact;

public class TestDeleteContact {

	public static void main(String[] args) throws SQLException {
		long id;
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Input id you want to delete: ");
		id = sc.nextLong();
		
		ContactDao contactDao = new ContactDao();

		contactDao.delete(id);
		
	}

}