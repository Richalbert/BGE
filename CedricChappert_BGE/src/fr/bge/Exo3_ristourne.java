/*
 * Q : Calcul du montant d’une remise
 * 	
 *  Un commerçant accorde une remise de 5 % pour tout achat d’un montant 
 *  compris entre 100 et 500 € et 8 % au-delà. 
 *  
 *  Écrire un programme de calcul du montant de la remise sur un achat donné.
 * 
 */

package fr.bge;

import java.util.Scanner;

public class Exo3_ristourne {
	
	private static double askValue() {
		Scanner sc = new Scanner(System.in);
		double nombre = sc.nextDouble();
		sc.close();
		return nombre;
	}

	public static void main(String[] args) {	
		
		double montantAchat = 0.0;	
		montantAchat = askValue();
		
		double remise = 0.0;
		if ( montantAchat >= 100.0 ) {
			if ( montantAchat >= 100 && montantAchat < 500 ) {
				remise = 0.05;
			} else if ( montantAchat >= 500 ) {
				remise = 0.08;
			}
		}
		
		double nouveauPrix = montantAchat * ( 1 - remise );	
		
		System.out.println("montant de l achat avant remise : " + montantAchat + " €");
		System.out.println("montant de la remise            : " + remise + " %");
		System.out.println("montant de l'achat apres remise : " + nouveauPrix + " €");
	}
}
