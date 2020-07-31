package fr.bge.boucles;

public class NombresPairs {

	public static void main(String[] args) {
		
		/*
		 * Q : 
 		 * Le programme qui prend en argument une liste de nombre, affiche les nombres pairs, 
 		 * sortir si un nombre est supérieur à 237 ou si on arrive à la fin de la liste
		 * 
		 */
		
		int [] tableauDEntiers;
		tableauDEntiers = new int[args.length];
		
		// traitement : String to int
		int sortir = args.length;
		for (int i= 0; i<args.length; i++) {
			tableauDEntiers[i] = Integer.parseInt(args[i]);
			System.out.print(tableauDEntiers[i] + " ");
			if ( tableauDEntiers[i] >= 237 ) {
				sortir = i ;
				break; // pour sortir de la boucle for
				//System.out.println("coucou " + i);
			}
		}
		System.out.println("* fin de la liste d arguments");
		
		// affichage des pairs
		for (int i= 0; i<args.length || i<sortir ; i++) {
			
			if ( ( tableauDEntiers[i] % 2 == 0 ) && ( i < sortir )	) {
				System.out.print(tableauDEntiers[i] + " ");
			}
		}
	}
}
