package vn.edu.vnuk.jdbc.test;

import java.sql.SQLException;
import java.util.List;

import vn.edu.vnuk.jdbc.dao.ContactDao;
import vn.edu.vnuk.jdbc.model.Contact;

public class TestReadContacts {

	public static void main(String[] args) throws SQLException {
		ContactDao contactDao = new ContactDao();
		List<Contact> contacts = contactDao.read();
		for(Contact contact : contacts) {
			System.out.println(String.format("id : %o" , contact.getId()));
			System.out.println(String.format("Name : %s" , contact.getName()));
			System.out.println(String.format("Address : %s" , contact.getAddress()));
			System.out.println(String.format("Email : %s" , contact.getEmail()));
			System.out.println(String.format("Date of register : %tD" , contact.getDateOfRegister()));
		}
	}

}
