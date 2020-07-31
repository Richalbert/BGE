package fr.richard.exceptionSpecifique.model;

import fr.richard.exceptionSpecifique.exception.MyException;

public class Salarie {

	private String nom;
	private String societe;
	
	
	public Salarie(String nom, String societe) {
		super();
		this.nom = nom;
		this.societe = societe;
	}

	public Salarie(String nom) {
		this.nom = nom;
	}

	private void setSociete(String societe) throws MyException {
		if (societe.contentEquals("Airbus")) throw new MyException ("Embauche suspendue", 37);
		//if (societe.contentEquals("Airbus") && )
		this.societe = societe;
	}
	
	public void embaucher (String societe) throws MyException {
		setSociete(societe);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSociete() {
		return societe;
	}
	
}
