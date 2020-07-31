package fr.richard.boulangerie.model;

import java.util.Vector;

/**
 * La vendeuse est une employee
 * Elle vends des lots de ...
 */
public class Vendeuse extends Employe {

	private Vector<Lot> lots;

	public Vendeuse(String nom) {
		super(nom);
		this.lots = new Vector<Lot>();
	}


	/**
	 * ce qui est vendu reduit le stock
	 * @param lot
	 */
	public void vend(Lot lot) {
		this.lots.add(lot);

	}


	@Override
	public String toString() {
		return "\n\tVendeuse [nom=" + nom + ", lots=" + lots + "]";
	}


}
