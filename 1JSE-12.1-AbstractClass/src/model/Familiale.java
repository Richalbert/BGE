package model;


// - FAMILIALE : Chaque familiale est caractérisée par 
//		une marque, 
//		un nom, 
//		un identifiant, 
//		un nombre de passagers maxi
public class Familiale extends Vehicule {
	
	private int nbPlace;
	

	public Familiale(String marque, String nom, String identifiant, int nbPlace) {
		super(marque, nom, identifiant);
		this.nbPlace = nbPlace;
	}


	@Override
	public void reviser() {
		System.out.println("Tous les 1000 kms pour la familiale: " +super.nom);

	}





}
