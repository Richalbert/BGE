package fr.richard.boulangerie.controller;


import fr.richard.boulangerie.model.Boulanger;
import fr.richard.boulangerie.model.Lot;
import fr.richard.boulangerie.model.Produit;
import fr.richard.boulangerie.model.Vendeuse;

public class Main {

	public static void main(String[] args) {


		Produit baguette  = new Produit("baguette", 0.10F, 0.78F);
		Produit croissant = new Produit("croissant", 0.15F, 1.10F);
		Produit painDeMie = new Produit("pain de mie", 0.35F, 2.50F);

		float recetteViolaine=0;		
		//Violaine vend 75 baguettes & 50 croissants 
		{
			Vendeuse violaine = new Vendeuse("Violaine");

			Lot baguettes  = new Lot(baguette, 75);
			Lot croissants = new Lot(croissant,50);

			violaine.vend(baguettes);
			violaine.vend(croissants);
			
			//System.out.println(Vendeuse.getTotalDesVentes());
			recetteViolaine = Vendeuse.getTotalDesVentes();
		}
System.out.println(recetteViolaine);

		float recetteVirginie=0;
		//Virginie vend 20 pains de mie.
		{
			Vendeuse virgine  = new Vendeuse("Virginie");

			Lot painsDeMie = new Lot(painDeMie,20);

			virgine.vend(painsDeMie);
			
			System.out.println(Vendeuse.getTotalDesVentes());
			recetteVirginie = Vendeuse.getTotalDesVentes();
		}

		
		
		//Bernard fabrique 80 baguettes, 25 pains de mie, 60 croissants.
		{
			Boulanger bernard = new Boulanger("Bernard");
			
			Lot baguettes = new Lot(baguette,80);
			Lot painsDeMie = new Lot(painDeMie,25);
			Lot croissants = new Lot(croissant,60);
			
			bernard.fabrique(baguettes);
			bernard.fabrique(painsDeMie);
			bernard.fabrique(croissants);
			
			System.out.println(Boulanger.getCoutDeProduction());

		}

		float solde = recetteViolaine + recetteVirginie - Boulanger.getCoutDeProduction();
		System.out.println("solde : " + solde);
		
	
	}

}
