package cinqExos;

import java.util.Scanner;

public class interet {

	public static void main(String[] args) {
		
		/*
		 * Calculs d’intérêts (1800 avant J.-C.)
		 *	– Trouver en combien d’années on double un montant soumis à
		 *	un certain taux annuel
		 *	1 - Initialiser le taux t à la valeur voulue, a à 0 et b à 1
		 *	2 - Tant que b < 2, remplacer b par b*(1+ t ) et ajouter 1 à a.
		 * 	3 - La valeur finale de a est le nombre d’années cherché
		 */
		
		
		System.out.println("entrer un taux : ");
		
		Scanner sc = new Scanner(System.in);
		double taux = sc.nextDouble();
		
		double a = 0;
		double b = 1;
		
		while ( b < 2 ) {
			b = b * ( 1 + taux );
			a++;
		}
		
		System.out.println("le nombre d annee ou son capital double est : " + a );
	}
}
