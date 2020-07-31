package fr.bge;

import java.util.Scanner;

public class Exo3_correction {

	public static void main(String[] args) {
		
		System.out.print("Veuillez entrer un montant : ");
		Scanner sc = new Scanner( System.in );
		String saisie = sc.nextLine();
		sc.close();
		
		// je recupere ma somme transformer en nombre float
		float prix = Float.parseFloat(saisie);	
		
		if ( prix <= 0 ) {
			System.out.println("Veuillez entrer un nombre positif");
		} else if ( prix < 100 ) {
			System.out.println("Aucune ristourne : " + prix);
		} else if ( prix < 500 ) {
			System.out.println("5% de ristourne : " + ( prix * 0.95 ) );	
		} else {
			System.out.println("8% de ristourne : " + ( prix * 0.92 ) );
		}
	}
}
