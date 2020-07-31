package affichageTriangle;

import java.util.Scanner;

public class SecondTriangle {

	public static void space(int nb) {
		
		for (int i=0; i<nb; i++) {
			System.out.print(" ");
		}
	}
	
	public static void star(int nb) {
		
		for (int i=0; i<nb; i++) {
			System.out.print("*");
		}
	}
	
	public static void uneEtoile() {
		System.out.print("*");
	}
	
	public static void aLaLigne() {
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		/*
		 * 	affichage:
		 * 
		 * 		Saisissez un nombre de lignes : 4
		 * 		    *
		 * 		   ***
		 * 		  *****
		 * 		 *******
		 */
		
		
		System.out.print("Saisissez un nombre de lignes : ");
		Scanner sc = new Scanner (System.in);
		int nbLigne = sc.nextInt();
		sc.close();
		
		for (int ligne=0; ligne<nbLigne; ligne++) {
			space(nbLigne-ligne);
			star(ligne);
			uneEtoile();
			star(ligne);
			aLaLigne();
		}
		
		/**********************
		 * 
		 * correction du prof
		 * 
		 * public static void star(int nb) {
		 * 		for (int i=0; i<nb; i++) {
		 * 			uneEtoile();
		 *		}
		 *	}
		 * 
		 * 
		 */
		
		
	/*
		
		// 1ere ligne				// compteur=1	
		space(3);					// compteurDeLigne = nbLigne-1 = nbLigne-compteur
		star(0);					// compteurDEtoile = 0
		uneEtoile();
		star(0);
		aLaLigne();
		
		// 2nd ligne				// compteur=2
		space(2);					// compteurDeLigne = nbLigne-2 = nbLigne-compteur
		star(1);					// compteuDEtoile = 1
		uneEtoile();
		star(1);
		aLaLigne();

		// 3ieme ligne				// compteur=3
		space(1);					// compteurDeLigne = nbLigne-3
		star(2);
		uneEtoile();
		star(2);
		aLaLigne();
		
		// 4ieme ligne
		space(0);
		star(3);
		uneEtoile();
		star(3);
		aLaLigne();
	*/	

	}
}
