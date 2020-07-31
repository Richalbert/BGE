package fr.bge.boucles;

import java.util.Arrays;

public class Args {

	public static void main(String[] args) {
		
		/*
		 * Faire une boucle qui affiche chaque argument du programme : ligne par ligne
		 * une version avec une boucle for (int i = 0....)
   		 * une version avec une boucle for each (faire une recherche sur le net)
		 *
		 */

		System.out.println("tableau des arguments : " + Arrays.toString(args));
		
		for ( int i=0; i<args.length; i++ ) {
			System.out.println("(for) : " + args[i]);
		}
		
		for (String e: args ) {
			System.out.println("(for2) : " + e);
		}
		
		int i = 0;
		while ( i<args.length) {
			System.out.println("(while) : " + args[i]);
			i++;
		}
		
		i = 0;
		do {
			System.out.println("(do ... while) : " + args[i]);
			i++;
		} while( i < args.length ) ;
	}

}
