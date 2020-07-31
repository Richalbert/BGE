package fr.richard.personne.model;

public class Personne {
	
	//----------------------------------------------
	// Les caracteristiques physiques : les donnees
	//----------------------------------------------
	private String nom;			// son nom
	private String societe;	// le nom de l'entreprise qui l'emploie
	
	
	//-----------------------------------------------------
	// Les caracteristiques comportementales : les actions
	//-----------------------------------------------------
	
	// constructeur a 2 parametres
	public Personne(String nom, String societe) {
		super();
		this.nom = nom.toUpperCase();
		this.societe = societe;
	}
	
	// constructeur a 1 parametre appelle le ctor a 2 parametres
	public Personne (String nom) {
		this(nom, "Free");
	}
	
	// constructeur a 0 parametre appelle le ctor a 1 parametre
	public Personne() {
		this("personne");
	}
	
	
	
	public void quitterSociete(){
		this.societe = "?";
	}
	
	
	
	
	public String getSociete() {
		return societe;
	}

	public void setSociete(String societe) {
		this.societe = societe;
	}

	public void integrerSociete (String entreprise) {
		this.societe = entreprise;
	}
	
	
	
	

	public void afficher() {
		System.out.print("Je m'appelle " + this.nom);
		
		if ( this.societe.contentEquals("?") ) {
			System.out.println(" et je ne suis pas salarie");
		} else {
			System.out.println(" et je travaille chez " + this.societe);
		}
	}
}
