package com.phdareys.excp.model;

import com.phdareys.excp.exception.EmployeeException;
import com.phdareys.excp.exception.ExceptionType;

public class Employee {

	private String name;
	private String firm;
	
	public Employee(String name) {
		super();
		this.name = name;
	}
	public void hire(String firm) throws EmployeeException {
		if (firm.equalsIgnoreCase(ManageProperties.getPropValue("firm_1")))
			throw new EmployeeException (ExceptionType.ERROR, ManageProperties.getPropValue("mess_1"));
		if (firm.equalsIgnoreCase(ManageProperties.getPropValue("firm_2")))
			throw new EmployeeException (ExceptionType.WARNING, ManageProperties.getPropValue("mess_2"));
		this.firm = firm;
		System.out.println (ManageProperties.getPropValue("success"));
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", firm=" + firm + "]";
	}
	public String getFirm() {
		// TODO Auto-generated method stub
		return firm;
	}


}
