package com.phdareys.employee.dao;

import java.util.ArrayList;

import com.phdareys.employee.model.Employee;

public class EmployeDAO {

	private int id;

	public EmployeDAO() {
		super();
		this.id = id;
	}

	public ArrayList<Employee> get() {
		Employee e = new Employee("Dupond", "Charles", 49);
		Employee e1 = new Employee("Brolt", "Anne", 54);
		Employee e2 = new Employee("Hilt", "Jeanne", 67);
		Employee e3 = new Employee("Holte", "Mike", 36);
		Employee e4 = new Employee("Bouna", "Isidore", 26);
		Employee e5 = new Employee("Bidouille", "Fanny", 30);

		ArrayList<Employee> emp = new ArrayList<Employee>();
		for (Employee emps : emp)
			System.out.println(emps);

		emp.add(e);
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		System.out.println(emp);
		return emp;
	}
}
