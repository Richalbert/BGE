/*
 * programme qui prend en argument un nombre. 
 * qui teste si le nombre est positif ou negatif 
 */

package fr.bge;

import java.util.Scanner;

public class Exo2_if {
	
	private static int askValue() {
		
		Scanner sc = new Scanner(System.in);
		int nombre = sc.nextInt();
		sc.close();
		
		return nombre;
	}
	

	private static void checkValue(int nombre) {
		
		if ( nombre >= 0 ) {
			System.out.println("Le nombre est positif");
		} else {
			System.out.println("Le nombre est negatif");
		}
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("**** Version 1 *****");
		
		String chaine = args[0];
		System.out.println(chaine);
	
		int nombre = Integer.parseInt(chaine);
		System.out.println(nombre);
		
		checkValue(nombre);
		
		
		System.out.println("**** Version 2 *****");
		
		nombre = askValue();
		checkValue(nombre);		
	}
}
