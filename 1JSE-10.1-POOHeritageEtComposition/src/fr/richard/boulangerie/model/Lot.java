package fr.richard.boulangerie.model;

import java.util.ArrayList;
import java.util.Vector;

/**
 * ensemble de produits (on peut acheter 1 ou plusieurs baguettes)
 * 
 * @author richard
 *
 */
public class Lot {

	
	private Produit produit;
	private int nbProduit;
	
	

	public Lot(Produit produit, int nbProduit) {
		super();
		this.produit = produit;
		this.nbProduit = nbProduit;
	}



	protected Produit getProduit() {
		return produit;
	}



	protected int getNbProduit() {
		return nbProduit;
	}
	
	
	
	
//
//	private Vector<Lot> lots;
//	
//	public lots (String nom ){
//		this.lots = new Vector<Lot>();
//		
//	}
//	
//	private ArrayList<Produit> listProduit = null;
//	private int nbProduit;
//	
//	
//	
//	
////	public Lot(ArrayList<Produit> listProduit, int nbProduit) {
////		super();
////		this.listProduit = listProduit;
////		this.nbProduit = nbProduit;
////	}
//	
//	public Lot(Produit baguette, int nbBaguette) {
//		this.listProduit.add(baguette);
//		this.nbProduit  = nbBaguette;
//	}


}
