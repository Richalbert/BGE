package model;


//- CITADINE: Chaque citadine est caractérisée par 
//		une marque, 
//		un nom, 
//		une autonomie et 
//		un identifiant (qui sera son immatriculation)
public class Citadine extends Vehicule {

	private int autonomie;
	
	
	public Citadine(String marque, String nom, String identifiant, int autonomie) {
		super(marque, nom, identifiant);
		this.autonomie = autonomie;
	}

	
	@Override
	public void reviser() {
		System.out.println("Tous les 500 pour la citadine: " +super.nom);
	}

}
