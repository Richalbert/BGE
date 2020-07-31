package affichageTriangle;

import java.util.Scanner;

public class PremierTriangle {

	public static void main(String[] args) {
		
		/*
		 * 	affichage :
		 * 		
		 * 		Saisissez un nombre de lignes : 4
		 * 		****
		 * 		***
		 * 		**
		 * 		*
		 */
		
		
		System.out.print("Saisissez un nombre de ligne : ");
		Scanner sc = new Scanner (System.in);
		int nbLigne = sc.nextInt();
		sc.close();
		
		for (int compteur=nbLigne ; compteur>0 ; compteur--) {		
			for (int i=0; i<compteur; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}