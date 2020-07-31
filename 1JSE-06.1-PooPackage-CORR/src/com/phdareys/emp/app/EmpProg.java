package com.phdareys.emp.app;

import com.phdareys.emp.model.Employee;
import com.phdareys.emp.view.EmpView;

public class EmpProg {

	public static void main(String[] args) {
			// init : inject data into model
		Employee emps [] = {
				new Employee ("Paul", "Durand", "Free", 30, 2000),
				new Employee ("Patricia", "Duval", "Orange", 35, 3000),
				new Employee ("Yann", "Dubois", "Sfr", 45, 3500),
				new Employee ("Carlos", "Gohn", "nissan", 55, 350000),
		};
			// use model to do the job
		for (Employee e:emps)
			e.run();
			// view result from model
		new EmpView(emps);
	}

}
