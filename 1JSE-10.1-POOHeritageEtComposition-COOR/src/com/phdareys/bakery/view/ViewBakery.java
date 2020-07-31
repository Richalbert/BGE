package com.phdareys.bakery.view;

import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

import com.phdareys.bakery.model.Firm;

public class ViewBakery {

	public ViewBakery(Firm f) {
		super();
		// TODO Auto-generated constructor stub
		String mess = 
				"Costs: " + f.getCost()+
				"\nIncomes: " +f.getIncome()+
				"\n----> BALANCE: "+f.getBalance();	
		showMessageDialog(null, mess, "Bakery Balance for: " +f.getName(), 
				INFORMATION_MESSAGE);
		System.out.println(mess);
		System.out.println (f);
	}
	

}
