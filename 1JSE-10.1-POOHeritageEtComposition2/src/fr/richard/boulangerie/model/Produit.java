package fr.richard.boulangerie.model;

/**
 * On produit (coût de fabrication, prix de vente):
 *  - des baguettes (0.10, 0.78)
 *  - des croissants (0.15, 1.10)
 *  - du pain de mie (0.35, 2.50)
 * @author richard
 *
 */

public class Produit {

	private String nom;
	private float prixFabrication;		// cout de fabrication
	private float prixVente;			// prix de vente
	private int stock;
	
	public Produit(String nom, float prixFabrication, float prixVente) {
		super();
		this.nom = nom;
		this.prixFabrication = prixFabrication;
		this.prixVente = prixVente;
	}

	public String getNom() {
		return nom;
	}

	public float getPrixFabrication() {
		return prixFabrication;
	}

	public float getPrixVente() {
		return prixVente;
	}

	@Override
	public String toString() {
		return "Produit [nom=" + nom + ", prixFabrication=" + prixFabrication + ", prixVente=" + prixVente + "]";
	}


	
	
	
	
}
