package fr.richard.boulangerie.model;

public class Vendeuse extends Employe {

	private static float totalDesVentes = 0.0F;
	

	public Vendeuse(String nom) {
		super(nom);
		
	}
	
	

	public static float getTotalDesVentes() {
		return totalDesVentes;
	}



	public float vend (Lot lot) {

		String key = lot.getProduit().getNom();

		switch (key) {
		case "baguette":
			System.out.println(lot.getNbProduit() + " " +  key + " fabriquees a " + lot.getProduit().getPrixFabrication() +"€");
			Vendeuse.totalDesVentes += lot.getNbProduit() * lot.getProduit().getPrixFabrication();
			break;
		case "croissant":
			System.out.println(lot.getNbProduit() + " " +  key + " fabriquees a " + lot.getProduit().getPrixFabrication() +"€");
			Vendeuse.totalDesVentes += lot.getNbProduit() * lot.getProduit().getPrixFabrication();
			break;
		case "pain de mie":
			System.out.println(lot.getNbProduit() + " " +  key + " fabriquees a " + lot.getProduit().getPrixFabrication() +"€");
			Vendeuse.totalDesVentes += lot.getNbProduit() * lot.getProduit().getPrixFabrication();
		}

		return Vendeuse.totalDesVentes;

	}
}
