package cinqExos;

import java.util.Scanner;

public class nbOccurenceDUneLettreDansUnePhrase {

	/*
	 * Vous avez la possibilité de parcourir les chaines de caractère comme des tableaux :
	 * Q : Faire un programme qui compte le nombre d’occurrence d’une lettre dans une phrase
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Saisissez la phrase :");
		String phrase = sc.nextLine();
		
		System.out.print("Saisissez la lettre : ");
		String str = sc.nextLine();
		char lettre = str.charAt(0);
		
		//System.out.println("la lettre est : " + lettre);
		
		int nbOccurence = 0;
		for (int i = 0; i < phrase.length(); i++) {
			if ( phrase.charAt(i) == lettre ) {
				nbOccurence++;
			}
		}
		
		System.out.println("\nDans la phrase : " + "\"" + phrase + "\"" );
		System.out.println("il y a " + nbOccurence + " fois la lettre " + lettre );		
		
		sc.close();
	}
}
