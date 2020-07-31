package com.phdareys.beans;

public class Employee {
	private int id;  
	private String name;  
	private Address address;//Aggregation  
	  
	public Employee() {}  
	  
	public Employee(int id, String name, Address address) {  
	    super();  
	    this.id = id;  
	    this.name = name;  
	    this.address = address;  
	}  
	  
	public void show(){  
	    System.out.println("\t" + id+"\t"+name + "\t" + address);  
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}  
	  
}
