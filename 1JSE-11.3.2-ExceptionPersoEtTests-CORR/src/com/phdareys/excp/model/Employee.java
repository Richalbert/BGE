package com.phdareys.excp.model;

import com.phdareys.excp.exception.EmployeeException;

public class Employee {
	private static final String FORBIDDEN_FIRM = "Airbus";
	private static final String FORBIDDEN_FIRM_MESS = "Hiring is currently not possible at Airbus";
	private static final String FORBIDDEN_FIRM2 = "Matignon";
	private static final String FORBIDDEN_EMP = "Philippe";
	private static final String FORBIDDEN_EMP_MESS = "This person can't be hired at Matignon";

	private String name;
	private String firm;
	
	public Employee(String name) {
		super();
		this.name = name;
	}
	public void hire(String firm) throws EmployeeException {
		if (firm.equalsIgnoreCase(FORBIDDEN_FIRM))
			throw new EmployeeException (true, FORBIDDEN_FIRM_MESS);
		if (firm.equalsIgnoreCase(FORBIDDEN_FIRM2) && name.equalsIgnoreCase(FORBIDDEN_EMP))
			throw new EmployeeException (true, FORBIDDEN_EMP_MESS);
		this.firm = firm;
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
