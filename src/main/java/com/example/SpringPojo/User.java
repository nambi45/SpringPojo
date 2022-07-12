package com.example.SpringPojo;

public class User {
private int id;
	
	private String firstName;
	
	private String lastName;
	
	private String emailId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public User(int id,String firstName, String lastName, String emailId) {
		super();
		this.id=id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}

	public User() {
		super();
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ "]";
	}
	
	
}
