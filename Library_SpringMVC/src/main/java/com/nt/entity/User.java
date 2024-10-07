package com.nt.entity;

public class User {

	private int id;
	private String name;
	private String address;

	private String emailId;
	private Long phoneNumber;
	private String password;
	private String country;

	public User() {

	}

	public User(int id, String name, String address, String emailId, Long phoneNumber, String password,String country) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
