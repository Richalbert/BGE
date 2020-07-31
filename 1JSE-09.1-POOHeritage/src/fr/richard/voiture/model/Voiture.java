package fr.richard.voiture.model;

/**
 * un véhicule c'est une marque, un modèle, une plaque d'immatriculation (identification):
 * (ex: "Toyota", "Corrola", "FS-456-EW")
 * 
 * @author richard
 *
 */
public class Voiture {
	
	public static int compteur = 0;

	protected String marque;
	protected String modele;
	protected String identification;
	
	private int distance;
	private boolean demarre;
	
	
	public Voiture(String marque, String modele, String identification) {
		super();
		this.marque = marque;
		this.modele = modele;
		this.identification = identification;
		this.distance = 0;
		this.demarre = false;
	}

	@Override
	public String toString() {
		return "Voiture [marque=" + marque + ", modele=" + modele + ", identification=" + identification + "]";
	}	
	
	
	
	public String getMarque() {
		return marque;
	}

	public void avancer() {
		this.distance ++;
	}

	public void demarrer() {
		this.demarre = true;
	}
	
	public int getDistance() {
		return distance;
	}

	protected void setDistance(int distance) {
		this.distance = distance;
	}


	protected void setDemarre(boolean demarre) {
		this.demarre = demarre;
	}

	public boolean estDemarre()	{
		return this.demarre;
	}
	
	
	public void avancePlusieursCoups(int n) {
		for (int i=0; i<n; i++) {
			avanceUnCoup ();
		}
	}
	
	public void avanceUnCoup () {
		
		if ( this.estDemarre() ) {
			this.demarrer();
		} else {
			this.avancer();
			Voiture.compteur++;	
		}
	}
	
	public void afficheDistance() {
		
	}
	
	
}
