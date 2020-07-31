package fr.richard.vector.controller;

import fr.richard.vector.model.Pays;

public class Main {

	public static void main(String[] args) {
		
		Pays espagne = new Pays("Europe", "Espagne", 32000000);
		Pays usa     = new Pays("Amérique du Nord", "US");
		
		//"Madrid", "Valence", "Bilbao"
		System.out.println( espagne.ajouterVille("Madrid") ) ;
		System.out.println( espagne.ajouterVille("Valence") );
		System.out.println( espagne.ajouterVille("Valence") );
		System.out.println( espagne.ajouterVille("Bilbao") );
		
		// "LA", "NY"
		System.out.println( usa.ajouterVille("LA") ); 
		System.out.println( usa.ajouterVille("LA") ); 	
		System.out.println( usa.ajouterVille("NY") );
		
		System.out.println(espagne.toString());
		System.out.println(usa.toString());
		
		System.out.println( espagne.supprimerVille("Valence") );
		System.out.println(espagne.toString());
		
		System.out.println( espagne.supprimerVille("Valence") );
		System.out.println(espagne.toString());
	}
}
