package vn.edu.vnk.jdbc.test;

import java.sql.SQLException;
import java.util.Calendar;

import vn.edu.vnuk.jdbc.dao.ContactDao;
import vn.edu.vnuk.jdbc.model.Contact;

public class TestCreateContact {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Contact contact = new Contact();
		contact.setName("");
		contact.setEmail("");
		contact.setAddress("");
		contact.setDateOfRegister(Calendar.getInstance());
	
		new ContactDao().create(contact);
}
}
