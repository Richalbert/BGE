package fr.richard.voiture.model;

/**
 * un véhicule familial comporte en plus un nombre de places assises.
 * 
 * @author richard
 *
 */
public class VehiculeFamilial extends Voiture {
	public static int compteur = 0;

	private int nbPlace;


	public VehiculeFamilial(String marque, String modele, String identification, int nbPlace) {
		super(marque, modele, identification);
		this.nbPlace = nbPlace;
	}


	@Override
	public String toString() {
		;
		return super.toString() + "\n -> VehiculeFamilial [nbPlace=" + nbPlace + "]";
	}

	public void avancer() {
		this.setDistance(this.getDistance() + 10);
		VehiculeFamilial.compteur++;	
	}


	public void avanceUnCoup () {

		if ( this.estDemarre() ) {
			this.demarrer();
		} else {
			this.avancer();
			
		}
	}
}
