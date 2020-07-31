package com.phdareys.excp.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.phdareys.excp.exception.EmployeeException;
import com.phdareys.excp.model.Employee;

class TestEmployee1 {

	@Test
	void test() {
		Employee e1=new Employee("Paul");
		try {
			e1.hire("orange");
			if (! e1.getFirm().equalsIgnoreCase("orange"))
				fail("Error test1");
		} catch (EmployeeException e) {
			e.error();
		}
		try {
			e1.hire("airbus");
			fail ("Test2");
		} catch (EmployeeException e) {
			e.error();
		}
		Employee e2=new Employee("Philippe");
		try {
			e2.hire("matignon");
			fail ("Test3");
		} catch (EmployeeException e) {
			e.error();
		}
		try {
			e2.hire("cnes");
			if (! e2.getFirm().equalsIgnoreCase("cnes"))
				fail("Error test4");
		} catch (EmployeeException e) {
			e.error();
		}
		
	}

}
