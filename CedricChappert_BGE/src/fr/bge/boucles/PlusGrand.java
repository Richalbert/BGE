package fr.bge.boucles;

import java.util.Arrays;
import java.util.Scanner;

public class PlusGrand {
	
	public static void main(String[] args) {
		
		/*
		 * Q : Ecrire un programme qui vérifie si tous les nombres d’une liste 
		 * sont plus grands qu’un nombre donné par un utilisateur
		 */
		
		System.out.print("Entrer le nombre MAX que la liste ne doit pas depasser :");
		Scanner sc = new Scanner (System.in);
		int max = sc.nextInt();
		sc.close();
		
		
		// la liste des nombres est fournie en argument au programme
		System.out.println("tableau des arguments (de String) : " + Arrays.toString(args));
		
		int [] tableauDEntiers;
		tableauDEntiers = new int[args.length];
		
		// traitement : String to int
		for (int i= 0; i<args.length; i++) {
			tableauDEntiers[i] = Integer.parseInt(args[i]);
			
		}
		
		// check
		boolean toujoursPlusGrand =true;
		for ( int e : tableauDEntiers) {
			if (e < max  ) {
				toujoursPlusGrand = false;
				break; // pour sortir de la boucle
			}
		}
		
		if (toujoursPlusGrand == true ) {
			System.out.println("Les nombres de la liste sont tous plus grand que " + max );
		} else {
			System.out.println("tous les nombres de la liste ne sont pas plus grands que " + max);
		}
	}
}
