package fr.richard.vector.controller;

import fr.richard.vector.model.Pays2;

public class Main2 {

	public static void main(String[] args) {

		Pays2 espagne = new Pays2("Europe", "Espagne", 32_000_000);
		Pays2 usa     = new Pays2("Amérique du Nord", "US");
		Pays2 france  = new Pays2 ("Europe", "France", 70_000, "Paris");
		System.out.println(france.toString());
		Pays2 france2  = new Pays2 ("Europe", "France", 70_000, new String [] {"Paris" , "Toulouse" });
		System.out.println(france2.toString());  

		//"Madrid", "Valence", "Bilbao"
		espagne.ajouterVille("Madrid") ;
		espagne.ajouterVille("Valence") ;
		espagne.ajouterVille("Valence") ;
		espagne.ajouterVille("Bilbao") ;

		// "LA", "NY"
		usa.ajouterVille("LA") ; 
		usa.ajouterVille("LA") ; 	
		usa.ajouterVille("NY") ;

		espagne.toString();
		usa.toString();

		espagne.supprimerVille("Valence") ;
		System.out.println(espagne.toString());

		espagne.supprimerVille("Valence") ;
		System.out.println(espagne.toString());
	}
}


