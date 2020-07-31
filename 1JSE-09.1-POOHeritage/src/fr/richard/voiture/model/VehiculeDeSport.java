package fr.richard.voiture.model;


/**
 * un véhicule de sport comporte en plus une vitesse de pointe.
 * 
 * @author richard
 *
 */
public class VehiculeDeSport extends Voiture {

	private int vitesseDePointe;

	
	public VehiculeDeSport(String marque, String modele, String identification, int vitesseDePointe) {
		super(marque, modele, identification);
		this.vitesseDePointe = vitesseDePointe;
	}


	@Override
	public String toString() {
		
		return super.toString() + "\n -> VehiculeDeSport [vitesseDePointe=" + vitesseDePointe + "]";
	}
	
	public void avancer() {
		this.setDistance(this.getDistance() + 100);
	}
	
}
