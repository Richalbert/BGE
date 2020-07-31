package fr.richard.boulangerie.model;

import java.util.Vector;

/**
 * Le boulanger est un employe
 * Il fabrique des lots
 */
public class Boulanger extends Employe {

	private Vector<Lot> lots;

	public Boulanger(String nom) {
		super(nom);
		this.lots = new Vector<Lot>();
	}

	public void fabrique(Lot lot) {
		this.lots.add(lot);
	}

	
	public Vector<Lot> getLots() {
		return lots;
	}

	@Override
	public String toString() {
		return "\n\tBoulanger [nom=" + nom + ", lots=" + lots + "]";
	}
	
//	@Override
//	public String toString() {
//		return super.toString() ;
//	}

}

