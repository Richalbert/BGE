package com.phdareys.register.bean;

public class Register {
	private String name;
	private String password;
	private String firstname;
	
	public Register(String name, String password, String firstname) {
		super();
		this.name = name;
		this.password = password;
		this.firstname = firstname;
	}

	public Register() {
		super();
		this.firstname = this.name = this.password = "";
	}

	public String getName() {
		return name.toUpperCase();
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstname() {
		return firstname.toLowerCase();
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
}
