package fr.richard.voiture.model;

public class VehiculeCitadin extends Voiture {
	
	public static int compteur = 0;
	
	private int autonomie;

	public VehiculeCitadin(String marque, String modele, String identification, int autonomie) {
		super(marque, modele, identification);
		this.autonomie = autonomie;
	}

	@Override
	public String toString() {
		;
		return super.toString() + "\n -> VehiculeCitadin [autonomie=" + autonomie + "]";
	}

	public void avancer() {
		this.setDistance(this.getDistance() + 5);
		VehiculeCitadin.compteur++;
	}
	
}
