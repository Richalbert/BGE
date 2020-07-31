package com.phdareys.emp.view;

import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

import com.phdareys.emp.model.Employee;

public class EmpView {

	public EmpView(Employee[] emps) {
		super();
		// TODO Auto-generated constructor stub
		String s = "";
		for (Employee e:emps)
			s += e +"\n";
		System.out.println (s);
				// display in popup
		showMessageDialog(null, s, "Employees", 
				INFORMATION_MESSAGE);
	}

}
