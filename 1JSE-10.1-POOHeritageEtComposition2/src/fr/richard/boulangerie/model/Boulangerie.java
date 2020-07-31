package fr.richard.boulangerie.model;

import java.util.Arrays;
import java.util.Vector;

/**
 * La boulangerie employe des salaries
 * @author richard
 *
 */
public class Boulangerie {
	
	private String nom;
	private Vector<Employe> employes;		//ArrayList<Employe> employes
	private double gains;
	
	
	
	public Boulangerie(String nom) {
		super();
		this.nom = nom;
		this.employes = new Vector<Employe>();
	}

	public void embaucher( Employe employe) {
		this.employes.add(employe);
	}

	@Override
	public String toString() {
		return "Boulangerie [nom=" + nom + ", employes=" + employes + "]";
	}
	
	
	public float coutDeFabrication(Employe employe) {
		
		
		
		return 0.0F;
	}
	
	
	public void recetteVendeuse(Employe employe) {
		

		if (employe instanceof Vendeuse) {
			for (Lot lot: (Vendeuse))
			
		}
		
	}
	
	
	
	public float recetteDe(Employe employe) {
		
		return 0.0F;
	}

}
