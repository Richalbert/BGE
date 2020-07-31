package fr.richard.personne.view;

import fr.richard.personne.model.Employe;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

public class Affichage {

	private static final String INFORMATION_MESSAGE = null;
	private Employe [] employes;
	

	public Affichage(Employe[] employes) {
		this.employes = employes;
			
		for (Employe employe : employes) {
			System.out.println(employe.toString());
			System.out.println("salaire annuel chargé : " + employe.coutAnnuel(employe) + " €\n");
		}
		
//		String str="";
//		for (Employe employe : employes) {
//			str += employe;
//		}
//		showMessageDialog(null,str,"Employees", INFORMATION_MESSAGE);
//		
	}

	
	
	
	
}
