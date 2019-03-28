package vn.edu.vnuk.jdbc.model;

import java.util.Calendar;

public class Contact {
	private Long id;
	private String name;
	private String email;
	private String address;
	private Calendar dateOfRegister;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Calendar getDateOfRegister() {
		return dateOfRegister;
	}
	public void setDateOfRegister(Calendar dateOfRegister) {
		this.dateOfRegister = dateOfRegister;
	}
	
	
}
