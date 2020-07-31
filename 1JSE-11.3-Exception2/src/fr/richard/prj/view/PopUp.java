package fr.richard.prj.view;

import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;


public class PopUp {

	String s = "";
	for (Employee e:emps)
		s += e +"\n";
	System.out.println (s);
			// display in popup
	showMessageDialog(null, s, "Employees", 
			INFORMATION_MESSAGE);
}

