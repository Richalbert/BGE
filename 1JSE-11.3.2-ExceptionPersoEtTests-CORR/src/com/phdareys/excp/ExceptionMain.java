package com.phdareys.excp;

import com.phdareys.excp.exception.EmployeeException;
import com.phdareys.excp.model.Employee;

public class ExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee("Pierre");
		try {
			emp.hire("airbus");
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.error();
		}
	}

}
