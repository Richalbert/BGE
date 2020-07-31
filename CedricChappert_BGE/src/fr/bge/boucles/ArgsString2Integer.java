package fr.bge.boucles;

import java.util.ArrayList;
import java.util.Arrays;

public class ArgsString2Integer {
	
	public static void main(String[] args) {
		
		/*
		 * Q : faire un programme qui prend une liste de nombre en argument, 
		 * ce programme devra transférer ces nombres qui sont des chaines de 
		 * caractères à la base dans un tableau d'entier
		 */
		
		// la liste des nombres est fournie en argument au programme
		System.out.println("tableau des arguments (de String) : " + Arrays.toString(args));
		
		ArrayList<Integer> liste;
		liste = new ArrayList<Integer>();
		
		// traitement : String to int
		for (String e: args ) {					
			liste.add(Integer.parseInt(e));
		}
		
		// affichage
		for (int e : liste) {
			System.out.println(e);
		}		
	
		/*****************************/
		
		int [] tableauDEntiers;
		tableauDEntiers = new int[args.length];
		
		// traitement : String to int
		for (int i= 0; i<args.length; i++) {
			tableauDEntiers[i] = Integer.parseInt(args[i]);
		}
		
		// affichage
		for (int e : liste) {
			System.out.print(" " + e);
		}		
		System.out.println();
	
	
	}
	
	
	
}
