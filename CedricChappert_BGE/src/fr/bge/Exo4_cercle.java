/*
 * *** Exo 4 ***
*	Faire un programme qui prend en argument la chose suivante :
*		aire 10, ou perimettre 20
*	en fontion de aire ou périmètre calculer l'aire du cercle ou le perimetre du cercle
*	Le programme ne devra pas fonctionner si :
*	Il y a plus de 2 arguments dans la ligne de commande
*	si le nombre est négatif
*	si le mot du début n'est pas aire ou perimetre
 */

package fr.bge;

import java.util.Arrays;

// aire 2 ... perimetre 12 ... toto 12 ... aire -2
//comment sortir d un programme ?
//comment comprarer des chaines de caracteres
public class Exo4_cercle {
	
	// 0 - si mon programme n'a pas exactement 2 arguments
	// -> le programme doit s arreter
	
	// 1 - je recupere le premier argument
	
	// 2 - je recupere le second argument
	
	// 3 - je teste si le premier argument est aire ou perimetre
	// sinon -> le programme doit s arreter
	
	// 4 - je teste si le second argument est bien un nombre positif
	// sinon -> le programme doit d'arreter
	
	public static void main(String[] args) {
		
		System.out.println("tableau des arguments " + Arrays.toString(args));
	
		System.out.println("nb arguments : " + args.length);
	
		if ( args.length != 2 ) {
			System.out.println("bye bye pas assez ou trop d'arguments");
		} else { 
			String str = args[0];		
			int r = Integer.parseInt(args[1]);
		
			if ( str.equalsIgnoreCase("AIRE") ) {
			System.out.println("L'aire du cercle est : " + Math.PI * r * r );
			} 
		
			if ( str.equalsIgnoreCase("PERIMETRE")) {
				System.out.println("Le pêrimetre du cercle est : " + 2 * Math.PI * r );
			}
		}
	}
}
