package fr.richard.boulangerie.model;

public class Boulanger extends Employe {
	
	private static float totalDesVentes = 0.0F;

	public Boulanger(String nom) {
		super(nom);

	}

	public static float getCoutDeProduction() {
		return totalDesVentes;
	}


	/**
	 * fabriquer ... ca coute
	 * @param lot
	 */
	public float fabrique(Lot lot) {
	
		
		String key = lot.getProduit().getNom();
		
		switch (key) {
		case "baguette":
			System.out.println(lot.getNbProduit() + " " +  key + " fabriquees a " + lot.getProduit().getPrixFabrication() +"€");
			Boulanger.totalDesVentes += lot.getNbProduit() * lot.getProduit().getPrixFabrication();
			break;
		case "croissant":
			System.out.println(lot.getNbProduit() + " " +  key + " fabriquees a " + lot.getProduit().getPrixFabrication() +"€");
			Boulanger.totalDesVentes += lot.getNbProduit() * lot.getProduit().getPrixFabrication();
			break;
		case "pain de mie":
			System.out.println(lot.getNbProduit() + " " +  key + " fabriquees a " + lot.getProduit().getPrixFabrication() +"€");
			Boulanger.totalDesVentes += lot.getNbProduit() * lot.getProduit().getPrixFabrication();
		}
		
		return Boulanger.totalDesVentes;
	}
}
