package com.phdareys.excp.app;

import com.phdareys.excp.exception.EmployeeException;
import com.phdareys.excp.model.Employee;
import com.phdareys.excp.model.ManageProperties;

public class ExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new ManageProperties("project.properties");
			String empName = ManageProperties.getPropValue("candidate");
			Employee emp = new Employee(empName);
			String empFirm = ManageProperties.getPropValue("firm");
			emp.hire(empFirm);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.error();
		}
	}

}
