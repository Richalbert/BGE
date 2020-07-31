package fr.richard.boulangerie.model;

public class Boulangerie {
	
	private String nom;
	private Employe [] tabEmploye;
	private float gain;
	private float perte;

	
	public void afficherBilan() {
		
	}
	
	public void embaucher() {
		
	}

	protected float getGain() {
		return gain;
	}

	protected void setGain(float gain) {
		this.gain = gain;
	}

	protected float getPerte() {
		return perte;
	}

	protected void setPerte(float perte) {
		this.perte = perte;
	}
	
	
}
