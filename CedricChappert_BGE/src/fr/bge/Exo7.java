package fr.bge;

import java.util.Scanner;

public class Exo7 {

	/**
	 * *** Exo 7 ***
	 * Q : Ecrire un programme qui calcule le signe du produit de deux nombres 
	 * réels sans calculer la valeur de ce produit. Par signe, on entend 
	 * positif, négatif
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrer un float x : ");
		float x = sc.nextFloat();
		System.out.print("Entrer un float y : ");
		float y = sc.nextFloat();
		if ( (x < 0 && y > 0) || (x > 0 && y < 0) ) {
			// Les signes sont différents sauf si un des nombres == 0
			System.out.println("Negatif");
		} else {
			// Dès lors qu'on a 1 zéro ou les 2 signes identiques, c'est positif
			System.out.println("Positif");
		}
		sc.close();
	}

}