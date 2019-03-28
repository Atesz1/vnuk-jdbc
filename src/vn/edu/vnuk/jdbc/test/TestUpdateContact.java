package vn.edu.vnuk.jdbc.test;

import java.sql.SQLException;
import java.util.Scanner;

import vn.edu.vnuk.jdbc.dao.ContactDao;
import vn.edu.vnuk.jdbc.model.Contact;

public class TestUpdateContact {

	public static void main(String[] args) throws SQLException{
		ContactDao contactDao = new ContactDao();
		
		long id;
		String name, email, address;
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Input id you want to update: ");
		id = sc.nextLong();
		
		Contact newContact = contactDao.read(id);
		
		System.out.println("INPUT NEW DATA! IF NOT CHANGE, ENTER '0' ");
		
		System.out.println("Input new name: ");
		name = sc.next();
		
		System.out.println("Input new email: ");
		email = sc.next();
		
		System.out.println("Input new address: ");
		address = sc.next();
		
		if (!name.equals("0")) {
			newContact.setName(name);
			System.out.println("NAME CHANGED!");
		} else {
			System.out.println("NAME UNCHANGED!");
		}
		
		if (!email.equals("0")) {
			newContact.setEmail(email);
			System.out.println("EMAIL CHANGED");
		} else {
			System.out.println("EMAIL UNCHANGED");

		}
		
		if (!address.equals("0")) {
			newContact.setAddress(address);
			System.out.println("ADDRESS CHANGED");
		} else {
			System.out.println("ADDRESS UNCHANGED");

		}

		contactDao.update(id, newContact);
		
	}

}