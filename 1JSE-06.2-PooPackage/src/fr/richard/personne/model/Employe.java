package fr.richard.personne.model;

public class Employe {

	 private static int compteur = 0;	// appartient a la classe
	
	/* 
	 * onne Pratique:
	 * Dans la classe modele, il y a des donnees en entree
	 * et des attributes de type sortie
	 */
	private String nom;			// son nom
	private String prenom;		// son prenom
	private String societe;		// le nom de l'entreprise qui l'emploie
	private double salaire;		// son salaire mensuel
	
	// on precise l'information que l'on recherche
	private double annualCost;

		
	// constructeur a 4 parametres
	public Employe(String nom, String prenom, String societe, double salaire) {
		this.nom = nom.toUpperCase();
		this.prenom = prenom;
		this.societe = societe;
		this.salaire = salaire;
		Employe.compteur ++;
		System.out.println(Employe.compteur);
		
	}
	
	// constructeur a 3 marametres qui appelle le ctor a 4 parametres
	public Employe(String nom, String prenom, String societe) {
		this(nom, prenom, societe, 0.0);
	}
	
	// constructeur a 2 parametres appelle le ctor a 3 parametres
	public Employe (String nom, String prenom) {
		this(nom, prenom, "nobody_societe");
	}
	
	// constructeur a 1 parametre appelle le ctor a 2 parametres
	public Employe (String nom) {
		this(nom, "nobody_prenom");
	}

	// constructeur a 0 parametre appelle le constructeur a 1 parametre
	public Employe () {
		this("nobody_name");
	}


	public double getSalaire() {
		return salaire;
	}


	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}


	@Override
	public String toString() {
		return "Employe [nom=" + nom + ", prenom=" + prenom + ", societe=" + societe + ", salaire=" + salaire + "]";
	}

	
	public double coutAnnuel(Employe employe) {
		return ( 12*this.getSalaire() ) * 1.9; 
	}

	

	public void setAnnualCost(double annualCost) {
		this.annualCost = annualCost;
	}

	public void run() {
		this.annualCost = 12*this.salaire * 1.9;
	}
	
	
	
}
